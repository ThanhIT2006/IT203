package BT1;
import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history = new Stack<>();
    public void addEdit(EditAction action) {
        history.push(action);
    }
    public EditAction undoEdit() {
        return history.pop();
    }
    public EditAction getLatestEdit() {
        return history.peek();
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }
    public void displayHistory() {
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
