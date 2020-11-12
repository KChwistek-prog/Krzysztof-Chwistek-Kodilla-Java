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

        board.addInProgressTask("Dokończyć zadania");
        board.addToDoTask("Uwarzyć nowe piwo");
        board.addDoneTask("Zabutelkować piwo");

        //when

        String inProgressResult = board.getInProgressList().getTasks().get(0);
        String doneListResult = board.getDoneList().getTasks().get(0);
        String toDoListResult = board.getToDoList().getTasks().get(0);
        //then
        assertEquals("Dokończyć zadania", inProgressResult);
        assertEquals("Zabutelkować piwo", doneListResult);
        assertEquals("Uwarzyć nowe piwo", toDoListResult);
    }
}
