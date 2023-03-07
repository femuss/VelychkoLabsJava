package edu.ntudp.fit.velychko.lab3.controller;

import edu.ntudp.fit.velychko.lab3.model.Group;
import edu.ntudp.fit.velychko.lab3.model.Human;

public class GroupCreator implements StructuralUnitCreatable<Group> {
    @Override
    public Group create(String name, Human headOfUnit) {
        return new Group(name, headOfUnit);
    }
}
