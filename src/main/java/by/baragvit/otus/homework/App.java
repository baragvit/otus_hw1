package by.baragvit.otus.homework;

import by.baragvit.otus.homework.resource.QuestionResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");
    QuestionResource resource = context.getBean(QuestionResource.class);
    System.out.println(resource.getQuestions());
  }
}
