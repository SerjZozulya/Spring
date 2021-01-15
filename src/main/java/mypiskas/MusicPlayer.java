package mypiskas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("musicPlayerBean")
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genres genres) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (genres) {
            case ROCK:
                System.out.println("Playing: " + music2.getSong()[randomNumber]);
                break;
            case CLASSICAL: System.out.println("Playing: " + music1.getSong()[randomNumber]);
        }
    }
}
