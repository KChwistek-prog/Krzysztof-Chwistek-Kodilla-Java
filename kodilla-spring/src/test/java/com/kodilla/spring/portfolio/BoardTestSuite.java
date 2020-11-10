package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.inProgressList.tasks.add("Dokończyć zadania");
        board.doneList.tasks.add("Zabutelkować piwo");
        board.toDoList.tasks.add("Uwarzyć nowe piwo");
        //when
        String inProgressResult = board.inProgressList.tasks.get(0);
        String doneListResult = board.doneList.tasks.get(0);
        String toDoListResult = board.toDoList.tasks.get(0);
        //then
        assertEquals("Dokończyć zadania", inProgressResult);
        assertEquals("Zabutelkować piwo", doneListResult);
        assertEquals("Uwarzyć nowe piwo", toDoListResult);
    }
}
