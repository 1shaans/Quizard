package dev.ishaan.quizard.Controller;


import dev.ishaan.quizard.Model.Question;
import dev.ishaan.quizard.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Question")
public class QuestionController {

//    @Autowired
//    QuestionService questionService;
    final QuestionService questionService;
    public QuestionController(QuestionService questionService){
        this.questionService=questionService;

    }
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();

    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){

        return questionService.getQuestionByCategory(category);
    }

    @PostMapping ("/add")
    public String addQuestion(@RequestBody Question question){
       return  questionService.addQuestion(question);

    }

    @DeleteMapping("/delete/{id}")
    public void  deleteQuestion(@PathVariable Integer id){
        questionService.delete(id);


    }
}
