package kz.javarush.kamenov.quest.repository;

import kz.javarush.kamenov.quest.entity.Quest;
import kz.javarush.kamenov.quest.entity.Question;

import java.io.IOException;
import java.net.URISyntaxException;

public interface GameRepository {
    Quest  readQuest() throws IOException, URISyntaxException;
    Question getQuestionById(Long id);
    public int getQuestSize();
}
