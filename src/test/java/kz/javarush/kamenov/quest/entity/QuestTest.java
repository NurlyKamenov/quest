package kz.javarush.kamenov.quest.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestTest {

    @Test
    void getId() {
        List<Question> questions = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            questions.add(new Question((long)i,String.valueOf(i),null));
        }
        Quest quest = new Quest(1L,"test",questions);
        assertEquals(1l,quest.getId());
    }

    @Test
    void getText() {
        List<Question> questions = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            questions.add(new Question((long)i,String.valueOf(i),null));
        }
        Quest quest = new Quest(1L,"test",questions);
        assertEquals("test",quest.getText());
    }

    @Test
    void getQuestions() {
        List<Question> questions = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            questions.add(new Question((long)i,String.valueOf(i),null));
        }
        Quest quest = new Quest(1L,"test",questions);
        assertEquals(questions,quest.getQuestions());
    }
}