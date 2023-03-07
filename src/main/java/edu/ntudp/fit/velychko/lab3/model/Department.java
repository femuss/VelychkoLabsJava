package edu.ntudp.fit.velychko.lab3.model;

public class Department extends StructuralUnit {
    public String facultyName = "";
    public Department(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    public void printInfo() {
        if (!facultyName.isEmpty()) {
            System.out.println("Department of the faculty: " + facultyName);
        }
        System.out.println("Name of the department: " + name +
                "\nName of the head of the department:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
