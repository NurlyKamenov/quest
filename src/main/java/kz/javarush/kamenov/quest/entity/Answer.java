package kz.javarush.kamenov.quest.entity;

import lombok.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    Long id;
    String text;
    Boolean correctAnswer;
    Question nextQuestion;
}
