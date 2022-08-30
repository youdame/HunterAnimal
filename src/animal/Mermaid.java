package animal;

public class Mermaid extends Animal {
    public static int knowledgeLevel=0;

    public Mermaid() {
        category = "ÀÎ¾î";

    }

    public Mermaid(String name) {
        this();
        this.name = name;

    }
    @Override
    public void play() {
        super.play();
        knowledgeLevel++;


    }
}