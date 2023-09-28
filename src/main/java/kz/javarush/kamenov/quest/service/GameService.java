package kz.javarush.kamenov.quest.service;

import kz.javarush.kamenov.quest.entity.Question;
import kz.javarush.kamenov.quest.repository.GameRepository;
import kz.javarush.kamenov.quest.repository.GameRepositoryImpl;


public class GameService {
    GameRepository gameRepository = new GameRepositoryImpl();


    public Question getQuestionById(Long id){
        return gameRepository.getQuestionById(id);
    }

    public int getQuestSize(){
        return gameRepository.getQuestSize();
    }


}
