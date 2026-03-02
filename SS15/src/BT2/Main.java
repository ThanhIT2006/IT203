package BT2;

public class Main {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();
        pq.addPatient(new Patient("P01", "Thanh", 25));
        pq.addPatient(new Patient("P02", "Dung", 30));
        pq.addPatient(new Patient("P03", "Hung", 40));

        System.out.println("=== Danh sách chờ ===");
        pq.displayQueue();
        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(pq.peekNextPatient());
        System.out.println("\nGọi khám:");
        System.out.println(pq.callNextPatient());
        System.out.println("\nDanh sách còn lại:");
        pq.displayQueue();
    }
}