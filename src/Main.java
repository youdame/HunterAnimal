import place.*;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" 1. 바다에서 포획하기 2. 하늘에서 포획하기  3. 연구소에 동물 보내기");
        System.out.println(" 4. 연구하기 5. 연구 성과 보기 6. 동물과의 친밀도 보기 7. 가방 크기 늘리기 0. 종료" );
        System.out.println("-----------------------------------------------------------------------");
    }



    public static void main(String [] args) {

        int menu;
        Scanner input = new Scanner(System.in);
        Sea sea =  Sea.getInstance();
        Sky sky =  Sky.getInstance();
        Lab lab = Lab.getInstance();

        Researcher researcher = new Researcher();

        while (true) {

            menu();
            System.out.print("menu: ");
            menu = input.nextInt();
            if (menu == 0) {
                System.out.println("프로그램 종료!");
                break;
            }
            switch (menu) {
                case 1:
                    researcher.capture(sea);
                    break;
                case 2:
                    researcher.capture(sky);
                    break;
                case 3:
                    researcher.sendToLab(lab);
                    break;
                case 4:
                    lab.research();
                    break;
                case 5:
                    lab.showResearch();
                    break;
                case 6:
                    lab.showIntimacy();
                    break;
                case 7:
                    researcher.upSizeBag(lab);
            }
            researcher.showBag();
            lab.show();
        }
    }
}
