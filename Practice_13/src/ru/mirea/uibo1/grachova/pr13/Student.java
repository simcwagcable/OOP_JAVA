package ru.mirea.uibo1.grachova.pr13;

public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', iDNumber=" + iDNumber + ", gpa=" + gpa + '}';
    }
}