package by.baragvit.otus.homework.resource;

import by.baragvit.otus.homework.model.Question;
import by.baragvit.otus.homework.service.QuestionService;

import java.util.stream.Collectors;

public class ConsoleQuestionResource implements QuestionResource {
  private final QuestionService questionService;

  public ConsoleQuestionResource(QuestionService questionService) {
    this.questionService = questionService;
  }

  @Override
  public String getQuestions() {
    return questionService.getQuestions()
        .stream()
        .map(Question::getText)
        .collect(Collectors.joining("\n"));
  }
}
