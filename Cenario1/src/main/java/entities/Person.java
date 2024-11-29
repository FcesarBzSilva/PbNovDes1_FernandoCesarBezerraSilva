package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person spouse;
    private List<Person> children = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Person parent) {
        this.name = name;
    }

    //Getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person getSpouse() {
        return spouse;
    }
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String toString() {
        if (spouse != null) {
            return name + " --- Married to: " + spouse.getName() + " -- Children: ";
        }else{
            return name + " -- single";
        }
    }

    public void printFamilyTree( int numero) {
        System.out.println(" ".repeat(numero) + toString());

        for (int i = 0; i < children.size(); i++) {
            children.get(i).printFamilyTree(numero + 1);
        }
    }
}
