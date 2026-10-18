package project1;

public class GraduateStudent extends Student {

    public GraduateStudent(String id, String name) {
        super(id, name);
    }

    @Override
    public double getPassingMark() {
        return 80;
    }
}
