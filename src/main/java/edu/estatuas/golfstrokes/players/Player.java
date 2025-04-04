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
    public String getIniciales(){
        return iniciales;
    }

    //setters

}
