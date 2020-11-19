package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private Map<String, Boolean> isCompleted = new HashMap<>();

    public Map<String, Boolean> getIsCompleted() {
        return isCompleted;
    }


    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask(String taskname) {
        this.isCompleted.put(taskname, true);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(String taskName) {
        return isCompleted.containsKey(taskName);
    }
}