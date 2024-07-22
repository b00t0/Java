package ru.gb.family_tree;

import java.time.LocalDate;
import java.util.List;

public class Human {
    String name;
    LocalDate dob, dod;
    Gender gender;
    Human father, mother;
    List<Human> children;
}
