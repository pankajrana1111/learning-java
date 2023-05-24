package com.pankaj;
public class Student{
    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;
    boolean international;

    public void compute(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("gpa: "+gpa);
        System.out.println("degree: "+degree);
        System.out.println("international: "+international);
    }

    public static void main(String[] args){
        Student student = new Student();
        student.id=1002;
        student.name="Anita";
        student.gender="female";
        student.age=20;
        student.phone=223_456_9999L;
        student.gpa=4.0;
        student.degree='M';
        student.international=true;
        student.compute();

    }
}