package entities;

public class Child extends Person{
    private Adult responsibleAdult;

    public Child(String name, int age, Adult responsibleAdult) {
        super(name, age);
        this.responsibleAdult = responsibleAdult;
        responsibleAdult.addChild(this);
    }

    public Child(String name, int age) {
        super(name, age);
    }

    public Adult getResponsibleAdult() {
        return responsibleAdult;
    }

    public void setResponsibleAdult(Adult responsibleAdult) {
        this.responsibleAdult = responsibleAdult;
    }
}

