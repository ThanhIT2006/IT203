package BT4;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority;
    private long order;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Name: " + name +
                " | Priority: " + priority;
    }
}
