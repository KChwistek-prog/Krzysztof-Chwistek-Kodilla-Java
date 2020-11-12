package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void LoggerTest(){
        //given
        Logger logger = Logger.INSTANCE;
        logger.log("Remove file");
        //when
        String result = logger.getLastLog();
        //then
        assertEquals("Remove file", result);
    }

}
