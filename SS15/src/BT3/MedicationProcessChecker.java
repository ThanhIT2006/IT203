package BT3;
import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions) {
        for (String action : actions) {
            if (action.equals("PUSH")) {
                stack.push(action);
            }
            else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Sai: POP khi Stack đang rỗng.");
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Sai: Kết thúc ca trực nhưng vẫn còn thuốc chưa hoàn tất.");
            return false;
        }
        System.out.println("Quy trình hợp lệ.");
        return true;
    }
    public void reset() {
        stack = new Stack<>();
    }
}