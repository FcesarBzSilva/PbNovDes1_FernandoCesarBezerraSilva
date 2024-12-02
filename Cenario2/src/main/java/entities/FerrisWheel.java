package entities;

public class FerrisWheel {
    private Gondola[] gondolas = new Gondola[18];

    public FerrisWheel() {
        for (int i = 0; i < gondolas.length; i++) {
            gondolas[i] = new Gondola(i + 1, null, null);
        }
    }

    public Gondola[] getGondolas() {
        return gondolas;
    }

    public void addPassenger(int gondolaNumber, Person person1, Person person2 ) {
        if (gondolaNumber > 18 || gondolaNumber < 1 ) {
            System.out.println("Unavailable");
        }
        if (gondolas[gondolaNumber -1].getSeat1() != null && gondolas[gondolaNumber -1].getSeat2() != null
                || gondolas[gondolaNumber -1].getSeat1() != null && gondolas[gondolaNumber -1].getSeat2() == null
                || gondolas[gondolaNumber -1].getSeat1() == null && gondolas[gondolaNumber -1].getSeat2() != null) {
            gondolaNumber = verifyAvailableGondola();
        }
        if(gondolas[gondolaNumber -1].getSeat1() == null && gondolas[gondolaNumber -1].getSeat2() == null) {
            if (person1.getAge() >= 12 && person2.getAge() >= 12) {
                gondolas[gondolaNumber - 1] = new Gondola(gondolaNumber, person1, person2);
            } else if (person1 instanceof Child) {
                if (((Child) person1).getResponsibleAdult().equals(person2)) {
                    gondolas[gondolaNumber - 1] = new Gondola(gondolaNumber, person1, person2);
                }
            } else if (person2 instanceof Child) {
                if (((Child) person2).getResponsibleAdult().equals(person1)) {
                    gondolas[gondolaNumber - 1] = new Gondola(gondolaNumber, person1, person2);
                }
            }
        }
    }

    public int verifyAvailableGondola(){
        for (int i = 0; i < gondolas.length; i++) {
            if (gondolas[i].getSeat1() == null && gondolas[i].getSeat2() == null) {
                return i + 1;
            }
        }
        throw new ArithmeticException("All gondolas are currently occupied.");
    }


}
