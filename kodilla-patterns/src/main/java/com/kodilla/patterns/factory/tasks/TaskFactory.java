package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task createTask(final String taskType) {
        return switch (taskType) {
            case SHOP -> new ShoppingTask("Tools", "Hammer", 1);
            case PAINT -> new PaitingTask("Garage works", "Blue", "Car");
            case DRIVE -> new DrivingTask("goWork", "To work", "Bike");
            default -> null;
        };


    }
}
