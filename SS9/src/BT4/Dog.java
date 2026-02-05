package BT4;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof woof...");
    }

    @Override
    public void action() {
        System.out.println("Đang chạy");
    }
}
