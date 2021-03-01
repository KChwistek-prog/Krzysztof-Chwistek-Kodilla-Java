package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testStudentSubscription() {
        //given
        Student tom = new Student("Tom");
        Student jerry = new Student("Jerry");
        Student adam = new Student("Adam");

        Mentor john = new Mentor("John");
        Mentor harry = new Mentor("Harry");

        tom.registerObserver(john);
        jerry.registerObserver(john);
        adam.registerObserver(harry);

        //when
        tom.sendTask("First task");
        tom.sendTask("Second task");
        jerry.sendTask("First task");
        adam.sendTask("First task");

        //then
        assertEquals(3, john.getCounter());
        assertEquals(1, harry.getCounter());
    }
}
