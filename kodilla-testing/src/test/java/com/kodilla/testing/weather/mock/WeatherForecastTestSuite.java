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

private static Map<String,Double> temperaturesMap(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
     return temperaturesMap;
      }

    private static Double generateAverge(Map<String, Double> temperaturesMap) {
        int amount = 0;
        double sum = 0;
        for (Map.Entry<String, Double> entry : temperaturesMap.entrySet()) {
            sum = sum + entry.getValue();
            amount++;
        }
        return (sum / amount) - 1 ;
    }

    private static double generateMedian(Map<String, Double> temperaturesMap) {
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
            median = (seriesValue.get(middle - 1) + seriesValue.get(middle) / 2);
        }
        return median - 1;
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

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testMedian() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemp = generateMedian(weatherForecast.calculateForecast());

        //Then
        Assertions.assertEquals(25.5, medianTemp);
    }

    @Test
    void testAverge() {

        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double temperatureAverge = generateAverge(weatherForecast.calculateForecast());

        //Then
        Assertions.assertEquals(25.56, temperatureAverge);
    }

}