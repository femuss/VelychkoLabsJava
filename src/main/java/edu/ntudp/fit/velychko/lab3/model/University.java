package edu.ntudp.fit.velychko.lab3.model;

import java.util.ArrayList;

public class University extends StructuralUnit {
    public ArrayList<Faculty> faculties = new ArrayList<>();
    public ArrayList<Department> departments = new ArrayList<>();
    public ArrayList<Group> groups = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();

    public University(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    public void printInfo() {
        System.out.println("Name of the university: " + name +
                "\nName of the head of the university:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
