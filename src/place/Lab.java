package place;

import animal.*;

import java.util.ArrayList;

public class Lab extends Place{

    ArrayList<Animal> labAnimal = new ArrayList<>();

    private static Lab instance = null;
    public static int totalResearchLevel;
    private Lab() { 	//�⺻ 10����
        this.where = "Lab";
    }

    public static Lab getInstance() {

        if(instance==null) instance = new Lab();
        return instance;
    }



    public void receiveAnimalArray(Animal[] bag){
        for (Animal a : bag){
            labAnimal.add(a);
        }

    }

    public void show() {
        System.out.println("==========================================================================");
        System.out.print("## Lab�� �ִ� ������ :");
        labAnimal.forEach(
                (Animal a) -> {
                    if(a != null) System.out.print(a + " ");
                    else System.out.print(" x  ");
                });
        System.out.println();
    }

    public void research(){
        for (Animal animal : labAnimal){
            if (animal != null) {
                animal.play();
            }
        }

    }


    public int showResearch(){

        System.out.println("Dragon ���� ����: " + Dragon.knowledgeLevel);
        System.out.println("Mermaid ���� ����: " + Mermaid.knowledgeLevel);
        System.out.println("Phoenix ���� ����: " + Phoenix.knowledgeLevel);
        System.out.println("Unicorn ���� ����: " + Unicorn.knowledgeLevel);
        totalResearchLevel = Dragon.knowledgeLevel + Mermaid.knowledgeLevel + Phoenix.knowledgeLevel + Unicorn.knowledgeLevel;
        System.out.println("�� ���� ���� : " + totalResearchLevel);
        return totalResearchLevel;
    }

    public void showIntimacy(){
        for (Animal animal : labAnimal){
            if (animal != null)
            System.out.println(animal + "���� ģ�е�: "+ animal.intimacy + " ");
    }
        System.out.println();
}

}
