package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    private static Map<String,Double> tempMap(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        return temperaturesMap;
    }

    private static Map<String, Double>generateAverge(Map<String, Double> temperaturesMap) {
        double avergeTemp;
        int amount = 0;
        double sum = 0;
        for (Map.Entry<String, Double> entry : temperaturesMap.entrySet()) {
            sum = sum + entry.getValue();
            amount++;
        }
        avergeTemp = (sum / amount) - 1;
        temperaturesMap.put("Averge", avergeTemp);
        return temperaturesMap;
    }

    private static Map<String, Double> generateMedian(Map<String, Double> temperaturesMap) {
        List<Double> seriesValue = new ArrayList<>();
        for (Map.Entry<String, Double> entry : temperaturesMap.entrySet()) {
            seriesValue.add(entry.getValue());
        }
        Collections.sort(seriesValue);
        Double median;
        int middle = seriesValue.size() / 2;
        if (seriesValue.size() % 2 == 1) {
            median = seriesValue.get(middle);
        } else {
            median = (seriesValue.get(middle - 1) + seriesValue.get(middle) / 2.0);
        }
        temperaturesMap.put("Median", median - 1);
        return temperaturesMap;
    }

    @BeforeEach
    public void before() {
        System.out.println("Starting new test.");
    }

    @AfterEach
    public void after() {
        System.out.println("Test ok");
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(tempMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testMedian() {
        //Given
        Map<String,Double>mediana = generateMedian(tempMap());
        when(temperaturesMock.getTemperatures()).thenReturn(mediana);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemp = weatherForecast.calculateForecast().get("Median");

        //Then
        Assertions.assertEquals(25.5, medianTemp);
    }
/*
    @Test
    void testAverge() {
        //Given
        Map<String, Double> averge = generateAverge(tempMap());
        when(temperaturesMock.getTemperatures()).thenReturn(averge);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double temperatureAverge = weatherForecast.calculateForecast().get("Averge");

        //Then
        Assertions.assertEquals(25.56, temperatureAverge);
}
 */
    }
