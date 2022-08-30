package place;

import animal.*;

import java.util.ArrayList;

public class Lab extends Place{

    ArrayList<Animal> labAnimal = new ArrayList<>();

    private static Lab instance = null;
    public static int totalResearchLevel;
    private Lab() { 	//기본 10마리
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
        System.out.print("## Lab에 있는 동물들 :");
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

        System.out.println("Dragon 연구 레벨: " + Dragon.knowledgeLevel);
        System.out.println("Mermaid 연구 레벨: " + Mermaid.knowledgeLevel);
        System.out.println("Phoenix 연구 레벨: " + Phoenix.knowledgeLevel);
        System.out.println("Unicorn 연구 레벨: " + Unicorn.knowledgeLevel);
        totalResearchLevel = Dragon.knowledgeLevel + Mermaid.knowledgeLevel + Phoenix.knowledgeLevel + Unicorn.knowledgeLevel;
        System.out.println("총 연구 레벨 : " + totalResearchLevel);
        return totalResearchLevel;
    }

    public void showIntimacy(){
        for (Animal animal : labAnimal){
            if (animal != null)
            System.out.println(animal + "과의 친밀도: "+ animal.intimacy + " ");
    }
        System.out.println();
}

}
