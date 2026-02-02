package BT2;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = a;

        System.out.println("Trước khi thay đổi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;

        System.out.println("Sau khi thay đổi b:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        Student s1 = new Student("Thanh");
        Student s2 = s1;

        System.out.println("Trước khi thay đổi:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);

        s2.name = "Dung";

        System.out.println("Sau khi thay đổi s2:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}