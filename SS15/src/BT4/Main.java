package BT4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();
        eq.addPatient(new EmergencyPatient("P01", "Thanh", 2));
        eq.addPatient(new EmergencyPatient("P02", "Dung", 1));
        eq.addPatient(new EmergencyPatient("P03", "Hung", 2));
        eq.addPatient(new EmergencyPatient("P04", "Phuong", 1));

        System.out.println("Thứ tự được khám:");
        while (true) {
            EmergencyPatient p = eq.callNextPatient();
            if (p == null) break;
            System.out.println(p);
        }
    }
}
