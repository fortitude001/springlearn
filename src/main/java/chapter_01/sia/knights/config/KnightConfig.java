package chapter_01.sia.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter_01.sia.knights.BraveKnight;
import chapter_01.sia.knights.Knight;
import chapter_01.sia.knights.Quest;
import chapter_01.sia.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
