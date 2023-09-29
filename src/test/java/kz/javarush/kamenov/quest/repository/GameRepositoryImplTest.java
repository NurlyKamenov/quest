package kz.javarush.kamenov.quest.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import kz.javarush.kamenov.quest.entity.Answer;
import kz.javarush.kamenov.quest.entity.Quest;
import kz.javarush.kamenov.quest.entity.Question;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameRepositoryImplTest {
    GameRepositoryImpl gameRepository = new GameRepositoryImpl();

    @Test
    void readQuest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("quest_UFO.json").getFile());
        Quest quest = objectMapper.readValue(file, Quest.class);

        assertEquals(quest.getId(),gameRepository.readQuest().getId());
    }

    @Test
    void getQuestionById() {

        assertEquals(3L, gameRepository.getQuestionById(3L).getId());
    }

    @Test
    void getQuestSize() {
        assertEquals(3,gameRepository.getQuestSize());
    }
}