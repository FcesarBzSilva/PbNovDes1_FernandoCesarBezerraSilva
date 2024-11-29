package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person spouse;
    private List<Person> children = new ArrayList<>();
}
