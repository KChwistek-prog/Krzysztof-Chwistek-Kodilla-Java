package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {
        //given
        TaskFactory tasks = new TaskFactory();

        //when
        Task shopping = tasks.createTask(TaskFactory.SHOP);

        //then
        assertEquals("Tools", shopping.getTaskName());
    }

    @Test
    void testPaintingTask() {
        //given
        TaskFactory tasks = new TaskFactory();

        //when
        Task painting = tasks.createTask(TaskFactory.PAINT);

        //then
        assertEquals("Garage works", painting.getTaskName());
    }

    @Test
    void testDrivingTask() {
        //given
        TaskFactory tasks = new TaskFactory();
        //when
        Task drive = tasks.createTask(TaskFactory.DRIVE);

        //then
        assertEquals("goWork", drive.getTaskName());
    }

    @Test
    void testTaskCompletion() {
        //given
        TaskFactory task = new TaskFactory();
        Task shop = task.createTask(TaskFactory.SHOP);
        shop.executeTask(shop.getTaskName());

        //when
        Boolean isCompleted = shop.isTaskExecuted(shop.getTaskName());

        //then
        assertEquals(true, isCompleted);
    }
}
