package edu.ntudp.fit.velychko.lab3.model;

public class Group extends StructuralUnit {
    public String departmentName = "";
    public Group(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    public void printInfo() {
        if (!departmentName.isEmpty()) {
            System.out.println("Group of the department: " + departmentName);
        }
        System.out.println("Name of the group: " + name +
                "\nName of the head of the group:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
