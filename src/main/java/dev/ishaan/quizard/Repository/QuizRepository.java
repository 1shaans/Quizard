package dev.ishaan.quizard.Repository;

import dev.ishaan.quizard.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
