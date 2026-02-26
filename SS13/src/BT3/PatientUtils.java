package BT3;

import java.util.*;

public class PatientUtils {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            T item = listA.get(i);
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}