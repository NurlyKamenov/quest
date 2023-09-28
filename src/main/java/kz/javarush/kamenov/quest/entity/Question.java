package kz.javarush.kamenov.quest.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;


import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(scope = Question.class, generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "Question_Id")
public class Question {
    Long id;
    String text;
    List<Answer> answers;
}
