package by.baragvit.otus.homework.resorce;


import by.baragvit.otus.homework.model.Question;
import by.baragvit.otus.homework.resource.ConsoleQuestionResource;
import by.baragvit.otus.homework.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class TestQuestionResource {

  @InjectMocks
  ConsoleQuestionResource resource;

  @Mock
  QuestionService questionService;

  @Test
  void printQuestions() {
    doReturn(List.of(new Question("Question 1")))
        .when(questionService).getQuestions();

    String questions = resource.getQuestions();

    assertEquals("Question 1", questions);
  }
}
