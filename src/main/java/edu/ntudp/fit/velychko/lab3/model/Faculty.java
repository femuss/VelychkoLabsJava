package edu.ntudp.fit.velychko.lab3.model;

public class Faculty extends StructuralUnit {
    public String universityName = "";
    public Faculty(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    public void printInfo() {
        if (!universityName.isEmpty()) {
            System.out.println("Faculty of the university: " + universityName);
        }
        System.out.println("Name of the faculty: " + name +
                "\nName of the head of the faculty:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
