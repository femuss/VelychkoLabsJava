package edu.ntudp.fit.velychko.lab3.controller;

import edu.ntudp.fit.velychko.lab3.model.Sex;

public interface HumanCreatable<T> {
    T create(String firstName, String lastName, String patronymic, Sex sex);
}
