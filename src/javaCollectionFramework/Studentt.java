package javaCollectionFramework;

public class Studentt {
    public int studentNum;
    public String name;

    public Studentt (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Studentt)) return false;
        Studentt student = (Studentt) obj;
        if(studentNum != student.studentNum) return false;
        return true;
    }
}
