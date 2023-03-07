package edu.ntudp.fit.velychko.lab3.controller;

import edu.ntudp.fit.velychko.lab3.model.Human;
import edu.ntudp.fit.velychko.lab3.model.University;

public class UniversityCreator implements StructuralUnitCreatable<University> {
    @Override
    public University create(String name, Human headOfUnit) {
        return new University(name, headOfUnit);
    }
}
