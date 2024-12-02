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

}
