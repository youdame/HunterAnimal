package animal;

public abstract class Animal implements Playable {
    public String name;
    public String category;
    public int intimacy = 0;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(category + "-" + name + " �� �Բ� ��ϴ�~~");
        intimacy++;
    }

    public String toString() {
        return category + "-" + name;
    }
}
