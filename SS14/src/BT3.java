import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class BT3 {
    public static void main(String[] args) {

        Set<String> drugIngredients = new HashSet<>(
                Arrays.asList("Aspirin", "Caffeine", "Paracetamol")
        );

        Set<String> allergies = new HashSet<>(
                Arrays.asList("Penicillin", "Aspirin")
        );

        Set<String> warning = new HashSet<>(drugIngredients);
        warning.retainAll(allergies);

        Set<String> safe = new HashSet<>(drugIngredients);
        safe.removeAll(allergies);

        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safe);
    }
}