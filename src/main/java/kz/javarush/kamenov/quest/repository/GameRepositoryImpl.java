package kz.javarush.kamenov.quest.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import kz.javarush.kamenov.quest.entity.Quest;
import kz.javarush.kamenov.quest.entity.Question;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class GameRepositoryImpl implements GameRepository {

    Quest quest;

    public GameRepositoryImpl() {
        this.quest = readQuest();
    }

    @Override
    public Quest readQuest() {
        ObjectMapper objectMapper = new ObjectMapper();
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("quest_UFO.json");
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + "quest_UFO.json");
        } else {
            File file;
            try {
                file = new File(resource.toURI());
            } catch (URISyntaxException e) {
                throw new RuntimeException("Неверный формат данных JSON");
            }
            try {
                return objectMapper.readValue(file, Quest.class);
            } catch (IOException e) {
                throw new RuntimeException("Ошибка при считывание файла Quest");
            }

        }
    }

    @Override
    public Question getQuestionById(Long id) {
        Question result = null;
        if (quest != null) {

            for (Question question : quest.getQuestions()
            ) {
                if (question.getId().equals(id))
                    result = question;
            }
        }
        return result;
    }

    public int getQuestSize() {
        return quest.getQuestions().size();
    }
}
