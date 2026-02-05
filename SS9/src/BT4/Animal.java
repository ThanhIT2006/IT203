package BT4;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Động vật đang kêu");
    }

    public void action() {
        System.out.println("Động vật đang hoạt động");
    }
}
