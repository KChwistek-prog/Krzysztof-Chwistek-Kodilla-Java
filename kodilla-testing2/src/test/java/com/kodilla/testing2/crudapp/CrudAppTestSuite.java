package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {
    public static final String BASE_URL = "https://kchwistek-prog.github.io/";
    private WebDriver driver;
    Random generator = new Random();


    @BeforeEach
    private void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
    }

    @AfterEach
    private void CleanUpAfterTests() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);
        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(
                By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("vescus@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("js9N5cIp$q8NDi-");
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();

        Thread.sleep(2000);

        driverTrello.findElement(By.id("password")).sendKeys("js9N5cIp$q8NDi-");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(8000);

        driverTrello.findElement(By.xpath("//div[@title=\"Kodilla Application\"]")).click();
        Thread.sleep(8000);

        result = driverTrello.findElements(By.xpath("//div[@class=\"list js-list-content\"]/div/a")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));

        driverTrello.close();

        return result;
    }

    private void deleteCrudAppCard(String taskName) throws InterruptedException {
        driver.findElements(By.xpath("//form[contains (@class, \"datatable__row\")]")).stream()
                .filter(elem -> elem.findElement(By.xpath("//fieldset/p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(button -> button.findElement(By.xpath("//fieldset/button[@data-task-delete-button]")).click());
        ;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        Thread.sleep(8000);
        deleteCrudAppCard(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
    }

}
