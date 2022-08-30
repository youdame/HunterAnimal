package animal;

public class Dragon extends Animal {
    public static int knowledgeLevel=0;

    public Dragon() {
        category = "용";

    }

    public Dragon(String name) {
        this();
        this.name = name;

    }

    @Override
    public void play() {
        super.play();
        knowledgeLevel++;

    }
}
