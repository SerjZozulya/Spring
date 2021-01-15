package mypiskas;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    String[] songs = {"Africa", "Anime", "Gay sex"};

    @Override
    public String[] getSong() {
        return songs;
    }
}
