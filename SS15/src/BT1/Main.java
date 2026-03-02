package BT1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditAction("Cập nhật triệu chứng", "10:00"));
        history.addEdit(new EditAction("Thêm thuốc A", "10:10"));
        history.addEdit(new EditAction("Chỉnh sửa liều lượng", "10:20"));

        System.out.println("=== Lịch sử hiện tại ===");
        history.displayHistory();
        System.out.println("\nUndo:");
        history.undoEdit();
        System.out.println("\nSau khi undo:");
        history.displayHistory();
    }
}