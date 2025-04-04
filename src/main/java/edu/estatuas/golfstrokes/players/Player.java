package edu.estatuas.golfstrokes.players;

public class Player {

    String iniciales;
    byte handicap;
    int puntuacionTotal;
    int puntosStableford;

    public Player(String iniciales, byte handicap){
        this.iniciales = iniciales;
        this.handicap = handicap;
    }

    //getters
    public String getInitials(){
        return iniciales;
    }

    public byte getHandicap(){
        return handicap;
    }

    public int getPuntuacionTotal(){
        return puntuacionTotal;
    }

    public int getPuntosStableford(){
        return puntosStableford;
    }

    //setters
    public void setPuntosStrokeplay(int puntosStrokeplay) {
        this.puntuacionTotal = puntosStrokeplay;
    }

    public void setPuntosStableford(int puntosStableford) {
        this.puntosStableford = puntosStableford;
    }


    @Override
    public String toString(){
        return iniciales + " ---> H'cap: " + getHandicap() + " \tStrokes: " + getPuntuacionTotal() + " \t Stableford: " + getPuntosStableford();
    }
}
