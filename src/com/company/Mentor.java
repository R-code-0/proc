package com.company;

public class Mentor extends Person {
    private Student[] students;
    private int i = 0;

    public Mentor(String name, int age, int maxStudents) {
        super(name, age);
        students = new Student[maxStudents];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void takeAnExam() {
        System.out.println(getName() + " is taking an exam:");
        for (Student s : students) {
            if (s == null) break;
            System.out.printf("\nStudent %s(%s) is answering:\n", s.getName(), s.getAge());
            s.explain();
        }
    }

    public void addStudent(Student student) {
        students[i] = student;
        i++;
    }
}
