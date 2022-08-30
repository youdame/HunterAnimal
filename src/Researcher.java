import place.*;
import animal.*;

public class Researcher {

    public int numOfAnimals;
    public int bagSize;
    private Animal[] bag;
    public static int sizeUpCount = 1;
    public static final int SizeUpAvailableLevel = 30;

    String name;

    public Researcher() {
        name = "������";
        bagSize = 3;
        bag = new Animal[bagSize];
    }

    public Researcher(String name) {
        this();
        this.name = name;
    }

    public void bagAddAnimal(Animal animal) {

        bag[numOfAnimals] = animal;
        numOfAnimals++;

    }

    public void capture(Place place) {
        if (numOfAnimals == bagSize) {
            System.out.println("������ �� ���� �� �̻� ��ȹ�� �� �����ϴ�. ������ ����ּ���.");
            return;
        }
        System.out.println(this.name + "�� ��ȹ�� �����մϴ�!");

        Animal capturedAnimal = place.capture();
        if (capturedAnimal == null) {
            System.out.println("��ȹ�� �����߽��ϴ�.");
        } else {
            bagAddAnimal(capturedAnimal);
        }
    }

    public void showBag() {
        System.out.print("�������� ���� : ");

        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null)
                System.out.print(bag[i] + " ");
            else
                System.out.print(" x  ");
        }
        System.out.println();
    }


    public void sendToLab(Lab lab){
        System.out.println("��� ������ �����ҿ� ���½��ϴ�.");
        lab.receiveAnimalArray(bag);
        for (int i = 0; i < bag.length; i++){
            bag[i] = null;
        }
        numOfAnimals = 0;

    }

    public void upSizeBag(Lab lab){
        if (lab.showResearch() > SizeUpAvailableLevel && sizeUpCount == 1){
            bagSize += 3;
            System.out.println("���� ����� Ŀ�����ϴ�! ���� ������: " + bagSize);
            bag = new Animal[bagSize];
            sizeUpCount++;

        } else if (sizeUpCount != 1) {
            System.out.println("���� ������ ���� �� ���� �����մϴ�.");
        }

        else {
            System.out.println("���� ������ �����մϴ�.");
        }

    }


}
