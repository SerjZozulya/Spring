package mypiskas;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Тащемта, реп - это кал, например";
    }
}
