package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case SHOP:
                return new ShoppingTask("Tools", "Hammer", 1);
            case PAINT:
                return new PaitingTask("Garage works", "Blue", "Car");
            case DRIVE:
                return new DrivingTask("goWork", "To work", "Bike");
            default:
                return null;
        }
    }
}
