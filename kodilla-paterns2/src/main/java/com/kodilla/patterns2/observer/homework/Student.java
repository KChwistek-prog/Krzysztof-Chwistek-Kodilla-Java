package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final List<Observer> observers;
    private final List<String> taskList;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        taskList = new ArrayList<>();
        this.name = name;
    }

    public void sendTask(String task) {
        taskList.add(task);
        notifyObservers();
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


}
