package BT2;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog("Jake", 4);
        System.out.println(Dog);
        Dog.sound();
        Animal Cat = new Cat("Mimi", 5);
        System.out.println(Cat);
        Cat.sound();
    }
}
