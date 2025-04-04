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

    //setters
    public void setPuntosStrokeplay(int puntosStrokeplay) {
        this.puntuacionTotal = puntosStrokeplay;
    }

    public void setPuntosStableford(int puntosStableford) {
        this.puntosStableford = puntosStableford;
    }
}
