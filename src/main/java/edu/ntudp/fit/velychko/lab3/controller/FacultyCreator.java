package edu.ntudp.fit.velychko.lab3.controller;

import edu.ntudp.fit.velychko.lab3.model.Faculty;
import edu.ntudp.fit.velychko.lab3.model.Human;

public class FacultyCreator implements StructuralUnitCreatable<Faculty> {
    @Override
    public Faculty create(String name, Human headOfUnit) {
        return new Faculty(name, headOfUnit);
    }
}
