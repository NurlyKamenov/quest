package kz.javarush.kamenov.quest.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void getId() {
        Question question = new Question(1L,"test", Arrays.asList(new Answer(1L,"answer",false,null)));

        assertEquals(1L,question.getId());
    }

    @Test
    void getText() {
        Question question = new Question(1L,"test", Arrays.asList(new Answer(1L,"answer",false,null)));

        assertEquals("test",question.getText());
    }

    @Test
    void getAnswers() {
        List<Answer> answers = new ArrayList<Answer>();
        for (long i = 1; i < 5; i++) {
            answers.add(new Answer(i,String.valueOf(i),false,null));
        }
        Question question = new Question(1L,"test",answers);
        assertEquals(answers,question.getAnswers());
    }
}