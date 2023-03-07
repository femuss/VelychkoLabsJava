package edu.ntudp.fit.velychko.lab3.model;

public abstract class StructuralUnit implements Printable {
    public String name;
    public Human headOfUnit;
    public StructuralUnit(String name, Human headOfUnit) {
        this.name = name;
        this.headOfUnit = headOfUnit;
    }
}
