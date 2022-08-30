package animal;

public class Unicorn extends Animal{
    public static int knowledgeLevel=0;


    public Unicorn(){
        category = "À¯´ÏÄÜ";
    }

    public Unicorn(String name){
        this();
        this.name= name;
    }
    @Override
    public void play() {
        super.play();
        knowledgeLevel++;


    }
}
