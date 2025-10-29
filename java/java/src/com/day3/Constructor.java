package com.day3;
class Students{
    String name;
    int rno;
    String dept;
    static String college;

    public Students(String name,int rno,String dept,String college){
        this.name=name;
        this.rno=rno;
        this.dept=dept;
        this.college=college;
    }

    public Students(){

    }
    public void display(){
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student.college = "MSAJ";
        Students s1 = new Students("thiru", 34, "ECE", "MSAJ");
        s1.display();
        System.out.println("----------------------");
        Students s2 = new Students();
        s2.name = "Muhil";
        s2.rno = 15;
        s2.dept = "CSE";
        s2.display();

    }
}
