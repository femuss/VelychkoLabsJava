package edu.ntudp.fit.velychko.lab3.model;

public class Student extends Human implements Printable {
    public String universityName = "";
    public String facultyName = "";
    public String departmentName = "";
    public String groupName = "";
    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
    @Override
    public void printInfo() {
        System.out.println("First name: " + firstName + ". Last name: " + lastName +
                ". Patronymic name: " + patronymic + ". Sex: " + sex);
        if (!universityName.isEmpty()) {
            System.out.println("University: " + universityName);
        }
        if (!facultyName.isEmpty()) {
            System.out.println("Faculty: " + facultyName);
        }
        if (!departmentName.isEmpty()) {
            System.out.println("Department: " + departmentName);
        }
        if (!groupName.isEmpty()) {
            System.out.println("Group: " + groupName);
        }
    }
}
