package place;

import animal.Animal;
import animal.Phoenix;
import animal.Unicorn;

public class Sky extends Place{
    private static Sky instance = null;

    private Sky() {
        System.out.println("하늘을 생성했습니다.");
    }

    public static Sky getInstance() {
        if  (instance == null) instance = new Sky();
        return instance;
    }
    public Animal capture() {
        double seed = Math.random();
        boolean isUnicorn = seed > 0.7;
        boolean isPhoenix = seed < 0.3;

        if (isUnicorn) {
            System.out.println("두둥...! 유니콘을 잡았습니다!!!");
            Unicorn unicorn1 = new Unicorn(Integer.toString((int) (Math.random() * 1000)));
            return unicorn1;

        } else if (isPhoenix) {
            System.out.println("두둥...! 불사조를 잡았습니다!!!");
            Phoenix phoneix = new Phoenix(Integer.toString((int) (Math.random() * 1000)));
            return phoneix;
        }
        return null;
    }
}

