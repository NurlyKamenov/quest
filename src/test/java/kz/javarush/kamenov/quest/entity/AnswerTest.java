package kz.javarush.kamenov.quest.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    @Test
    void getId() {
        Answer answer = new Answer(1L,"test",true,null);
        assertEquals(1L,answer.getId());
    }

    @Test
    void getText() {
        Answer answer = new Answer(1L,"test",true,null);
        assertEquals("test",answer.getText());
    }

    @Test
    void getCorrectAnswer() {
        Answer answer = new Answer(1L,"test",true,null);
        assertEquals(true,answer.getCorrectAnswer());
    }

    @Test
    void getNextQuestion() {
        Answer answer = new Answer(1L,"test",true,null);
        assertEquals(null,answer.getNextQuestion());
    }
}