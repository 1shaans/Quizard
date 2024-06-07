package dev.ishaan.quizard.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question_title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String right_answer;
    private String difficulty_level;
    private String category;


    public Integer getId() {
        return id;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getRight_answer() {
        return right_answer;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public String getCategory() {
        return category;
    }
}
