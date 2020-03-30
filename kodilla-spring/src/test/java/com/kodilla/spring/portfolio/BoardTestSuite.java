package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("- Feed dog");
        board.toDoList.tasks.add("- Make dinner");
        board.toDoList.tasks.add("- Read new book");
        board.inProgressList.tasks.add("- Finish Java course");
        board.doneList.tasks.add("- Do some shopping");

        String checkWhatToDo = board.toDoList.getTasks().get(1);

        //Then
        System.out.println(checkWhatToDo);
        Assert.assertEquals("- Make dinner", checkWhatToDo);

    }
}
