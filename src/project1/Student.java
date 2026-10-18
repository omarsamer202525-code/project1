package project1;

import java.util.ArrayList;

public abstract class Student implements Passable {
    private String id;
    private String name;
    private ArrayList<Double> marks = new ArrayList<Double>();

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addMark(double mark) {
        marks.add(mark);
    }

    public boolean updateMark(int markNumber, double newMark) {
        if (markNumber < 1 || markNumber > marks.size()) {
            return false;
        }

        marks.set(markNumber - 1, newMark);
        return true;
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public double getMark(int markNumber) {
        return marks.get(markNumber - 1);
    }

    public double getAverage() {
        if (marks.size() == 0) {
            return 0;
        }

        double total = 0;

        for (double mark : marks) {
            total = total + mark;
        }

        return total / marks.size();
    }

    public boolean hasPassed() {
        return marks.size() > 0 && getAverage() >= getPassingMark();
    }
}
