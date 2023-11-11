package org.campus02;

public class Student {

    private int matrNr;
    private String fullName;

    public Student(int matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
