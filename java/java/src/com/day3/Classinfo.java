package com.day3;
class Student{
    String name;
    int rno;
    String dept;
    static String college;
    public void display(){
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
    }
}

public class Classinfo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="kavi";
        s1.rno=52;
        s1.dept="ECE";
        Student.college="MSAJ";
        s1.display();
        System.out.println("----------------------");
        Student s2=new Student();
        s2.name="velan";
        s2.rno=53;
        s2.dept="CSE";
        s2.display();

    }
}
