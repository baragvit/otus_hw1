package by.baragvit.otus.homework.service;

import by.baragvit.otus.homework.dao.QuestionDao;
import by.baragvit.otus.homework.model.Question;

import java.util.List;

public class SimpleQuestionService implements QuestionService {
  private final QuestionDao questionDao;

  public SimpleQuestionService(QuestionDao questionDao) {
    this.questionDao = questionDao;
  }

  @Override
  public List<Question> getQuestions() {
    return questionDao.getQuestions();
  }
}
