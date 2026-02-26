import java.util.ArrayList;

public class BT1 {
    public static void main(String[] args) {

        ArrayList<Double> patient = new ArrayList<>();
        patient.add(36.5);
        patient.add(40.2);
        patient.add(37.0);
        patient.add(12.5);
        patient.add(39.8);
        patient.add(99.9);
        patient.add(36.8);

        System.out.println("Danh sách ban đầu:");
        System.out.println(patient);

        for (int i = patient.size() - 1; i >= 0; i--) {
            if (patient.get(i) < 34.0 || patient.get(i) > 42.0) {
                patient.remove(i);
            }
        }

        System.out.println("Danh sách sau khi lọc:");
        System.out.println(patient);

        double sum = 0;
        for (int i = 0; i < patient.size(); i++) {
            sum += patient.get(i);
        }

        double avg = sum / patient.size();
        System.out.printf("Nhiệt độ trung bình: %.2f\n", avg);
    }
}