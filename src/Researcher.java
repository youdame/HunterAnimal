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
        name = "조유담";
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
            System.out.println("가방이 꽉 차서 더 이상 포획할 수 없습니다. 가방을 비워주세요.");
            return;
        }
        System.out.println(this.name + "이 포획을 시작합니다!");

        Animal capturedAnimal = place.capture();
        if (capturedAnimal == null) {
            System.out.println("포획에 실패했습니다.");
        } else {
            bagAddAnimal(capturedAnimal);
        }
    }

    public void showBag() {
        System.out.print("연구원의 가방 : ");

        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null)
                System.out.print(bag[i] + " ");
            else
                System.out.print(" x  ");
        }
        System.out.println();
    }


    public void sendToLab(Lab lab){
        System.out.println("모든 동물을 연구소에 보냈습니다.");
        lab.receiveAnimalArray(bag);
        for (int i = 0; i < bag.length; i++){
            bag[i] = null;
        }
        numOfAnimals = 0;

    }

    public void upSizeBag(Lab lab){
        if (lab.showResearch() > SizeUpAvailableLevel && sizeUpCount == 1){
            bagSize += 3;
            System.out.println("가방 사이즈가 커졌습니다! 가방 사이즈: " + bagSize);
            bag = new Animal[bagSize];
            sizeUpCount++;

        } else if (sizeUpCount != 1) {
            System.out.println("가방 사이즈 업은 한 번만 가능합니다.");
        }

        else {
            System.out.println("아직 레벨이 부족합니다.");
        }

    }


}
