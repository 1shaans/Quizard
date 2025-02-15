package dev.ishaan.quizard.Model;

import lombok.Data;

@Data
public class QuestionWrapper {

  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question_title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    //private String right_answer;
   // private String difficulty_level;
    private String category;

    public QuestionWrapper(Integer id, String question_title, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.question_title = question_title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.category = category;
    }
}
