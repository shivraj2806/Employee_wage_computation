package com.bridgelabz;

public class Employeewage {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int employee_wage_per_Hr = 20;
    public static final int NO_of_working_days = 20;
    public static final int max_hr_in_month = 100;
    public static void main(String[] args) {
        System.out.println("calculate employee wage");

        int empHr = 0;
        int empWage = 0;
        int total_emp_hr = 0;
        int total_working_days=0;

        int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
        while (total_emp_hr<=max_hr_in_month&&total_working_days<NO_of_working_days){
            total_working_days++;
            switch (employeecheck) {
                case is_full_time:
                    empHr = 4;
                    break;
                case is_part_time:
                    empHr = 8;
                    break;
                default:
                    empHr = 0;

            }
            total_emp_hr +=empHr;
            System.out.println("Day#:" + total_working_days + "emp hr:"+empHr);
        }
       int total_emp_wage = total_emp_hr * employee_wage_per_Hr;
        System.out.println("total emp wage:"+total_emp_wage);
    }
}