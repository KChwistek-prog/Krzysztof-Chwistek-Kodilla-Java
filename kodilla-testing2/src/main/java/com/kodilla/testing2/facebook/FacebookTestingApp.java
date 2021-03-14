package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT = "//div[contains(@class, \"uiLayer\")]/div/div/div/div/div/div/button[2]";
    public static final String XPATH_REG = "//div[contains(@id, \"reg_pages_msg\")]/a";
    public static final String XPATH_SIGNUP = "//span[contains(@class, \"signup_box_content\")]/a";
    public static final String XPATH_DAY = "//div[contains(@id, \"birthday_wrapper\")]/div[2]/span/span/select[contains (@id, \"day\")]";
    public static final String XPATH_MONTH = "//div[contains(@id, \"birthday_wrapper\")]/div[2]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@id, \"birthday_wrapper\")]/div[2]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        WebElement acceptPolicy = webDriver.findElement(By.xpath(XPATH_ACCEPT));
        acceptPolicy.click();

        WebElement msg = webDriver.findElement(By.xpath(XPATH_REG));
        msg.click();

        WebElement signup = webDriver.findElement(By.xpath(XPATH_SIGNUP));
        signup.click();

        WebElement dayCombo = webDriver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(dayCombo);
        selectDay.selectByValue("29");

        WebElement monthCombo = webDriver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(monthCombo);
        selectMonth.selectByValue("6");

        WebElement yearCombo = webDriver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(yearCombo);
        selectYear.selectByValue("1987");
    }
}
