package by.baragvit.otus.homework.service;

import by.baragvit.otus.homework.dao.QuestionDao;
import by.baragvit.otus.homework.model.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class SimpleQuestionServiceTest {
  @InjectMocks
  SimpleQuestionService simpleQuestionService;

  @Mock
  QuestionDao questionDao;

  @Test
  public void getQuestions() {
    doReturn(List.of(new Question("question")))
        .when(questionDao).getQuestions();

    List<Question> questions = simpleQuestionService.getQuestions();

    assertEquals(1, questions.size());
  }

}