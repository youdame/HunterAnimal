package place;

import animal.Animal;
import animal.Phoenix;
import animal.Unicorn;

public class Sky extends Place{
    private static Sky instance = null;

    private Sky() {
        System.out.println("�ϴ��� �����߽��ϴ�.");
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
            System.out.println("�ε�...! �������� ��ҽ��ϴ�!!!");
            Unicorn unicorn1 = new Unicorn(Integer.toString((int) (Math.random() * 1000)));
            return unicorn1;

        } else if (isPhoenix) {
            System.out.println("�ε�...! �һ����� ��ҽ��ϴ�!!!");
            Phoenix phoneix = new Phoenix(Integer.toString((int) (Math.random() * 1000)));
            return phoneix;
        }
        return null;
    }
}

