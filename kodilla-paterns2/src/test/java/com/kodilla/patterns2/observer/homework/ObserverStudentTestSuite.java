package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverStudentTestSuite {

    @Test
    public void testObserver() {
        //given
        Student student_1 = new Student("testStudent1");
        Student student_2 = new Student("testStudent2");
        Mentor mentor_1 = new Mentor("Mentor_1");

        student_1.registerObserver(mentor_1);
        student_2.registerObserver(mentor_1);

        //when
        student_1.sendTask("Test_task_1");
        student_1.sendTask("Test_task_2");
        student_2.sendTask("Test task");

        //then
        assertEquals(3, mentor_1.getCounter());
    }
}
