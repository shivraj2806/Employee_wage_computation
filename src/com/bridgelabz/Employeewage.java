package com.bridgelabz;

public class Employeewage {
        public static void main(String[] args){
            int is_present = 1;
            double wage_per_Hr = 200;
            double full_day_Hr = 8;
            double daily_emp_wage = wage_per_Hr * full_day_Hr;
            double employeecheck = Math.floor(Math.random()*10) % 2;
            if (employeecheck == is_present)
                System.out.println("employee is present and daily salary is"+daily_emp_wage);
            else
                System.out.println("employee is absent");
        }
    }
