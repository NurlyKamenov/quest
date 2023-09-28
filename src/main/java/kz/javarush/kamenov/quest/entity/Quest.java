package kz.javarush.kamenov.quest.entity;

import lombok.*;

import java.util.List;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Quest {
    Long id;
    String text;
    List<Question> questions;

}
