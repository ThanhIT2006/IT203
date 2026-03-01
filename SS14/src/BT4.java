import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BT4 {
    public static void main(String[] args) {

        List<String> diseases = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        Map<String, Integer> report = new TreeMap<>();

        for (int i = 0; i < diseases.size(); i++) {
            String disease = diseases.get(i);

            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            } else {
                report.put(disease, 1);
            }
        }

        Object[] keys = report.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            String key = (String) keys[i];
            System.out.println(key + ": " + report.get(key) + " ca");
        }
    }
}