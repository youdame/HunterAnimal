package animal;

public class Phoenix extends Animal{
    public static int knowledgeLevel=0;

    public Phoenix(){

        category = "∫“ªÁ¡∂";
    }

    public Phoenix(String name){
        this();
        this.name = name;
    }

    @Override
    public void play() {
        super.play();
        knowledgeLevel++;

    }
}
