package BT5;
import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }
    public void addStep(TreatmentStep step) {
        steps.push(step);
    }
    public TreatmentStep undoStep() {
        return steps.pop();
    }
    public void displaySteps() {
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
    public Patient getPatient() {
        return patient;
    }
}