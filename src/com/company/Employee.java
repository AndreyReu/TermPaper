package com.company;

public class Employee {
    String staff;
    int salaryStaff;
    int departmentNumber;
    int id;
    static int counter;


    public Employee(String staff, int salaryStaff, int departmentNumber) {
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        this.id = getCounter();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getStaff() {
        return staff;
    }

    public int getId() {
        return id;
    }

    public int getSalaryStaff() {
        return salaryStaff;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setSalaryStaff(int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + staff +
                "Зарплата сотрудника: " + salaryStaff +
                " Номер департеманта: " + departmentNumber +
                " Идентификационный номер: " + id;
    }
}

    


