package project1;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String id, String name) {
        super(id, name);
    }

    @Override
    public double getPassingMark() {
        return 60;
    }
}
