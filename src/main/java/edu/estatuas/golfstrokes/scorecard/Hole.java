package edu.estatuas.golfstrokes.scorecard;

public class Hole {
    byte posicion;
    byte par;


    public Hole(byte posicion, byte par) {
        this.posicion = posicion;
        this.par = par;
    }

    public byte getPosicion() {
        return posicion;
    }

    public byte getPar() {
        return par;
    }

    @Override
    public String toString() {
        return "\t" + posicion + " - " + par;
    }
}
