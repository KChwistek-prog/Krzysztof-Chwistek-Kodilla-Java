package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public interface Task {
    Map<String, Boolean> isCompleted = new HashMap<>();

    void executeTask(String taskName);

    String getTaskName();

    boolean isTaskExecuted(String taskName);
}
