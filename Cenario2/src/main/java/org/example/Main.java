package org.example;

import entities.Adult;
import entities.Child;
import entities.FerrisWheel;


public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel();
        Adult paulo = new Adult("Paulo", 42);
        Child joao = new Child("Joao", 5, paulo);
        Child maria = new Child("Maria", 12, paulo);
        Child pedro = new Child("Pedro", 13);
        Child henrique = new Child("Henrique", 10);

        ferrisWheel.addPassenger(2, joao, maria);
        ferrisWheel.addPassenger(2, joao, paulo);
        ferrisWheel.addPassenger(3, maria);
        ferrisWheel.addPassenger(13, pedro);
        ferrisWheel.addPassenger(16, henrique);

        ferrisWheel.printFerrisWheelStatus();
    }
}