package dev.ishaan.quizard.Service;


import dev.ishaan.quizard.Model.Question;
import dev.ishaan.quizard.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionRepository.save(question);
        return "Success";
    }

    public void delete(Integer id) {
        questionRepository.deleteById(id);
    }
}
