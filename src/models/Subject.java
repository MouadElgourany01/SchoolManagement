package models;

public class Subject {
    private final int id;
    private String label;
    private static int SUBJECT_COUNTER;

    public Subject() {
        this.id = SUBJECT_COUNTER++;
    }
    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id:" + id +
                ", label:" + label +
                '}';
    }

}
