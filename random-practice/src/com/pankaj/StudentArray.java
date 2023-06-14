package com.pankaj;
public class StudentArray {
    public static void main(String[] args){
        StudentClass[] students={new StudentClass()}; //declaring a reference of type array or StudentClass
        //students={new StudentClass()};
        //students[0]=new StudentClass();
        System.out.println(students[0].name);
        System.out.println(students.length);
    }
}
class StudentClass{
    static String name="Pankaj";
    static int id=1000;
    static int rank=1;
}
