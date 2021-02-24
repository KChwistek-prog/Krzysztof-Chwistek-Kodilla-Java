package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;

    public DrivingTask(final String taskName, final String where, final String using) {
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
