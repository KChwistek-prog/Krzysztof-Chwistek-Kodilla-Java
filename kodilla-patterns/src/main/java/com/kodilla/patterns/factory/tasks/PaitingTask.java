package com.kodilla.patterns.factory.tasks;

public class PaitingTask implements Task {
    private final String taskName;

    public PaitingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
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
