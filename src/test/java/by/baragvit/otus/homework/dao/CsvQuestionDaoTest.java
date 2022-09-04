package by.baragvit.otus.homework.dao;

import by.baragvit.otus.homework.model.Question;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CsvQuestionDaoTest {

  @Test
  void readQuestionsFromCsv() {
    CsvQuestionDao csvQuestionDao = new CsvQuestionDao("questions.csv");
    List<Question> questions = csvQuestionDao.getQuestions();
    assertEquals(2, questions.size());
    assertTrue(questions.iterator().next().getText().contains("question"));
  }
}