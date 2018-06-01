package chapter_02.stereo_mixedconfig.soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter_02/stereo_mixedconfig/cdplayer-config.xml")
public class ImportJavaConfigTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule().enableLog();

  @Autowired
  private MediaPlayer player;


  @Test
  public void play() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
        log.getLog());
  }

}
