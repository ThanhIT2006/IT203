package BT3;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();
        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] case2 = {"PUSH", "POP", "POP"};
        String[] case3 = {"PUSH", "PUSH", "POP"};

        System.out.println("Case 1:");
        checker.checkProcess(case1);
        checker.reset();
        System.out.println("\nCase 2:");
        checker.checkProcess(case2);
        checker.reset();
        System.out.println("\nCase 3:");
        checker.checkProcess(case3);
    }
}
