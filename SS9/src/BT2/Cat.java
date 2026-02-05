package BT2;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Meow meow...");
    }
}