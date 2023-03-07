package edu.ntudp.fit.velychko.lab3.controller;

import edu.ntudp.fit.velychko.lab3.model.Human;

public interface StructuralUnitCreatable<T> {
    T create(String name, Human headOfUnit);
}
