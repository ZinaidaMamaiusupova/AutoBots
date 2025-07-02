package com.autobots.java.streamapi;

public class Employee {
    private  int id;
    private String name;
    private int age;
    private int salary;
    private String departement;

    public Employee(int id, String name, int age, int salary, String departement) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return  " id = " + id +
                " name = " + name +
                " age = " + age +
                " salary = " + salary +
                " department = " + departement+ "\n";
    }
}
