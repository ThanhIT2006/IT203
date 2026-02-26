import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BT2 {

    public static List<String> removeDuplicates(List<String> medicine) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < medicine.size(); i++) {
            String medicineItem = medicine.get(i);
            if (!result.contains(medicineItem)) {
                result.add(medicineItem);
            }
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        List<String> medicine = new ArrayList<>();
        medicine.add("Paracetamol");
        medicine.add("Ibuprofen");
        medicine.add("Panadol");
        medicine.add("Paracetamol");
        medicine.add("Aspirin");
        medicine.add("Ibuprofen");
        System.out.println("Input: ");
        System.out.println(medicine);
        List<String> result = removeDuplicates(medicine);
        System.out.println("Output: ");
        System.out.println(result);
    }
}