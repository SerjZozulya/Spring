package mypiskas;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    String[] songs = {"Sektor Gaza", "Proklyatiy Stariy Dom", "Du Hast"};
    @Override
    public String[] getSong() {
        return songs;
    }
}
