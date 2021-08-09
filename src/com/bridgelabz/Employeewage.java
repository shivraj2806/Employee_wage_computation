package com.bridgelabz;

public class Employeewage {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int employee_wage_per_Hr = 20;
    public static final int NO_of_working_days = 20;

    public static void main(String[] args) {
        System.out.println("calculate employee wage");

        int empHr = 0;
        int empWage = 0;
        int total_emp_wage = 0;

        int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
        for (int day = 0; day <= NO_of_working_days; day++) {
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
            empWage = empHr * employee_wage_per_Hr;
            total_emp_wage += empWage;
            System.out.println("employee wage is" + empWage);
        }
        System.out.println(+total_emp_wage);
    }
}