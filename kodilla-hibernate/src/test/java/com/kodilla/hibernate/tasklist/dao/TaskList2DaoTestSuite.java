package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskList2DaoTestSuite {
    @Autowired
   private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //given
       TaskList taskList = new TaskList("Tom", "Task Description");
       taskListDao.save(taskList);

        //when
       String result = taskListDao.findByListName("Tom").get(0).getListName();

        //then
       assertEquals("Tom", result);

        //cleanUp
        taskListDao.delete(taskList);
    }


}
