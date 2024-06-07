package dev.ishaan.quizard.Controller;


import dev.ishaan.quizard.Model.QuestionWrapper;
import dev.ishaan.quizard.Model.Response;
import dev.ishaan.quizard.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Quiz")
public class QuizController {
    @Autowired
    QuizService quizService;




    //http://localhost:8080/api/Quiz/create?category=java&numQ=5&title=JQuiz - this is post request for creating the quiz;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category , @RequestParam int numQ , @RequestParam String title ){

    return quizService.createQuiz(category,numQ,title);
    }

    //http://localhost:8080/api/Quiz/get/1 this is a get request so that client may get a quiz to solve
    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }

    //http://localhost:8080/api/Quiz/submit/1 this is a Post request to submit a quiz and see the result of the quiz
    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id, responses);
    }
}
