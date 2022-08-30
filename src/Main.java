import place.*;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" 1. �ٴٿ��� ��ȹ�ϱ� 2. �ϴÿ��� ��ȹ�ϱ�  3. �����ҿ� ���� ������");
        System.out.println(" 4. �����ϱ� 5. ���� ���� ���� 6. �������� ģ�е� ���� 7. ���� ũ�� �ø��� 0. ����" );
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
                System.out.println("���α׷� ����!");
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
