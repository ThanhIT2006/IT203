package BT2;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println("Woof woof...");
    }
}