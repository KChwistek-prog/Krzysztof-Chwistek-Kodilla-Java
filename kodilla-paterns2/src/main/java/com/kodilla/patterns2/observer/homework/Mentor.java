package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int counter;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        System.out.println(mentorName + ", " + student.getName() + " sent task.");
        counter++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getCounter() {
        return counter;
    }
}
