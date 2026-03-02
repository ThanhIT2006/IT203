package BT4;
import java.util.PriorityQueue;

public class EmergencyQueue {
    private long counter = 0;
    private PriorityQueue<EmergencyPatient> queue =
            new PriorityQueue<>((p1, p2) -> {
                if (p1.getPriority() != p2.getPriority()) {
                    return p1.getPriority() - p2.getPriority();
                }
                return Long.compare(p1.getOrder(), p2.getOrder());
            });
    public void addPatient(EmergencyPatient p) {
        p.setOrder(counter++);
        queue.add(p);
    }
    public EmergencyPatient callNextPatient() {
        return queue.poll();
    }
    public void displayQueue() {
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}
