package edu.ntudp.fit.velychko.lab3.model;

public class Human implements Printable {
    public String firstName;
    public String lastName;
    public String patronymic;
    public Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public void printInfo() {
        System.out.println("First name: " + firstName + ". Last name: " + lastName +
                ". Patronymic name: " + patronymic + ". Sex: " + sex);
    }
}
