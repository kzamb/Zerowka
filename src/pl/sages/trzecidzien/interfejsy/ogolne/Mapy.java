package pl.sages.trzecidzien.interfejsy.ogolne;

import java.util.HashMap;
import java.util.Map;

public class Mapy {
    public static void main(String[] args) {
        Map<String,String> translator = new HashMap<>();

        translator.put("pies","dog");
        translator.put("kot","cat");
        translator.put("mysz","mouse");
        translator.put("słońce","sun");
        translator.put("człowiek","human");

        System.out.println(translator.get("pies"));


    }
}
