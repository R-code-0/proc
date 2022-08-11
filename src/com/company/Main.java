package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random r = new Random();
        Student[] sts = new Student[40];
        for (int i = 0; i < sts.length; i++) {
            String s = "";
            for (int j = 0; j < r.nextInt(2, 9); j++) {
                s += (char) r.nextInt(65, 91);
            }
            sts[i] = new Student(s, r.nextInt(15, 51));
        }
        Mentor mentor1 = new Mentor("Mentor1", 25, sts.length);
        Mentor mentor4 = new Mentor("Mentor4", 25, sts.length);
        Mentor mentor3 = new Mentor("Mentor3", 25, sts.length);
        Mentor mentor2 = new Mentor("Mentor2", 25, sts.length);
        Mentor[] mentors = new Mentor[]{mentor1, mentor2, mentor3, mentor4};
        for (Student s : sts) {
            mentors[r.nextInt(0, 4)].addStudent(s);
        }
        mentor1.takeAnExam();
        System.out.println("----------------");
        mentor4.takeAnExam();
        System.out.println("----------------");
        mentor3.takeAnExam();
        System.out.println("----------------");
        mentor2.takeAnExam();
    }
}

