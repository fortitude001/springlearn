package chapter_02.stereo_mixedconfig.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:chapter_02/stereo_mixedconfig/cd-config.xml")
public class SoundSystemConfig {

}
