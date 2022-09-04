package by.baragvit.otus.homework.dao;

import by.baragvit.otus.homework.model.Question;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvQuestionDao implements QuestionDao {
  private final String questionPath;
  public CsvQuestionDao(String questionPath) {
    this.questionPath = questionPath;
  }

  @Override
  public List<Question> getQuestions() {
    InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(questionPath);
    List<Question> questions = new ArrayList<>();
    try (CSVReader csvReader = new CSVReader(new InputStreamReader(inputStream))) {
      String[] values = null;
      while ((values = csvReader.readNext()) != null) {
        questions.add(new Question(values[0]));
      }
    } catch (CsvValidationException | IOException e) {
      throw new RuntimeException(e);
    }
    return questions;
  }
}
