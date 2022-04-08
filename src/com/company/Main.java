package com.company;

public class Main {

    public static void countMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employees[0].getSalaryStaff() > employee.getSalaryStaff()) {
                System.out.println("Cотрудник с минимальной зарплатой:" + employee.getStaff() + employee.getSalaryStaff());
            }
        }
    }

    public static void countMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        String staffMan = "";
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalaryStaff()) {
                maxSalary = employee.getSalaryStaff();
                staffMan = employee.getStaff();
            }
        }
        System.out.println("Сотрудника с максимальной зарплатой:" + staffMan + maxSalary);
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
    }

    public static void averageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        int average = sum / employees.length;
        System.out.println("Средняя зарплата: " + average);
    }

    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Cотрудники компании: " + employee.getStaff());
        }
    }

    public static void main(String[] args) {

        Employee [] employee = new Employee[10];
        employee[0] = new Employee(" Ivanov Ivan Ivanovich ", 55000, 1);
        employee[1] = new Employee(" Makarov Makar Makarovich ", 65000, 2);
        employee[2] = new Employee(" Maksimov Maksim Maksimovich ", 99000, 3);
        employee[3] = new Employee(" Vasilkov Visaliy Vasilylievich ", 98000, 4);
        employee[4] = new Employee(" Bykin Gennadi Gennadievich ", 120000, 5);
        employee[5] = new Employee(" Galkin Maksim Maksimovich ", 130000, 1);
        employee[6] = new Employee(" Pygacheva Nadezda Valerievna ", 200000, 2);
        employee[7] = new Employee(" Kirkorov Vladimir Ostapovich ", 33000, 3);
        employee[8] = new Employee(" Kirienko Viktor Viktorovich ", 78000, 4);
        employee[9] = new Employee(" Medvedev Dmitriy Ivanovich ", 140000, 5);
        typeAllStaff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        countAllStaff(employee);
    }
    }








