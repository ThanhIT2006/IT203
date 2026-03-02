package BT5;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        EmergencyCase case1 = new EmergencyCase( new Patient("P01", "Thanh"));
        EmergencyCase case2 = new EmergencyCase( new Patient("P02", "Dung"));
        queue.addCase(case1);
        queue.addCase(case2);

        EmergencyCase current = queue.getNextCase();
        System.out.println("Đang xử lý: " + current.getPatient());
        current.addStep(new TreatmentStep("Tiếp nhận", "09:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "09:10"));
        current.addStep(new TreatmentStep("Điều trị", "09:20"));

        System.out.println("\nCác bước hiện tại:");
        current.displaySteps();
        System.out.println("\nUndo bước:");
        current.undoStep();
        System.out.println("\nSau khi Undo:");
        current.displaySteps();
    }
}