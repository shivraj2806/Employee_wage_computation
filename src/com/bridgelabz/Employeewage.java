package com.bridgelabz;

public class Employeewage {
        public static final int is_part_time = 1;
        public static final int is_full_time = 2;
        public static final int employee_wage_per_Hr = 20;

        public static void main(String[] args) {
            System.out.println("calculate employee wage");

            int empHr = 0;
            int empWage = 0;
            int employeecheck = (int)Math.floor(Math.random() * 10) % 3;
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
            System.out.println("employee wage is" + empWage);
        }
    }