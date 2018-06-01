package chapter_02.stereo_xmlconfig.soundsystem.properties;
import org.springframework.beans.factory.annotation.Autowired;

import chapter_02.stereo_xmlconfig.soundsystem.CompactDisc;
import chapter_02.stereo_xmlconfig.soundsystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
