package org.example;

import entities.Adult;
import entities.Child;
import entities.FerrisWheel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel();
        Adult paulo = new Adult("Paulo", 42);

        Child joao = new Child("Joao", 5, paulo);
        Child maria = new Child("Maria", 12, paulo);
    }
}