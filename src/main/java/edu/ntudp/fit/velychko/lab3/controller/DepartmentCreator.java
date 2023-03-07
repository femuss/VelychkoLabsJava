package edu.ntudp.fit.velychko.lab3.controller;

import edu.ntudp.fit.velychko.lab3.model.Department;
import edu.ntudp.fit.velychko.lab3.model.Human;

public class DepartmentCreator implements StructuralUnitCreatable<Department> {
    public Department create(String name, Human headOfUnit) {
        return new Department(name, headOfUnit);
    }
}
