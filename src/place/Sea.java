package place;

import animal.*;

public class Sea extends Place {
    private static Sea instance = null;

    private Sea() {
        System.out.println("바다를 생성했습니다.");
    }

    public static Sea getInstance() {
        if (instance == null) instance = new Sea();
        return instance;
    }

    public Animal capture() {
        double seed = Math.random();
        boolean isDragon = seed > 0.7;
        boolean isMermaid = seed < 0.3;

        if (isDragon) {
            System.out.println("두둥...! 용을 잡았습니다!!!");
            Dragon dragon = new Dragon(Integer.toString((int) (Math.random() * 1000)));
            return dragon;

        } else if (isMermaid) {
            System.out.println("두둥...! 인어를 잡았습니다!!!");
            Mermaid mermaid = new Mermaid(Integer.toString((int) (Math.random() * 1000)));
            return mermaid;
        }
        return null;
    }
}