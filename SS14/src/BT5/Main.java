package BT5;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Patient> queue = new TreeSet<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p1.severity != p2.severity) {
                    return p1.severity - p2.severity;
                }

                return p1.arrivalTime - p2.arrivalTime;
            }
        });

        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        Object[] arr = queue.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
