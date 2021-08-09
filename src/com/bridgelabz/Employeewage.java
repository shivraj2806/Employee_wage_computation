package com.bridgelabz;

public class Employeewage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation");
    int is_present = 1;
    double employeecheck = Math.floor(Math.random()*10) % 2;
    if (employeecheck == is_present)
            System.out.println("employee is present");
    else
            System.out.println("employee is absent");

    }
}
