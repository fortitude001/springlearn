package chapter_01.sia.knights;

import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext(
            "chapter_01/META-INF/spring/minstrel.xml");
    Knight kight = context.getBean(Knight.class);
    kight.embarkOnQuest();
    context.close();
  }

}
