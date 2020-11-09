package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    Library library;
    @Test
    void testLoadFromDb() {
        //given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Library library = context.getBean(Library.class);
        //when
        library.loadFromDb();

        //then
        //do nothing
    }

    @Test
    void testSaveToDatabase() {
        //given
       // ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       // Library library = context.getBean(Library.class);
        //when
        library.saveToDb();

        //then
        //do nothing
    }

    @Test
    void testContext(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //when and then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

}
