package edu.estatuas.golfstrokes.golfplay;

import edu.estatuas.golfstrokes.players.Player;
import edu.estatuas.golfstrokes.scorecard.ScoreCard;

public class ComputeCard {

    ScoreCard scorecard;
    GolfPlay modalidad;

    public ComputeCard(ScoreCard scorecard, GolfPlay modalidad) {
        this.scorecard = scorecard;
        this.modalidad = modalidad;
    }

    // hay que traer a los jugadores presentes en la scorecard


    public byte[] getPlayerCourse(Player player){
        return scorecard.getPlayerCourse(player);
    }

    public int compute(){
        return modalidad.calcularPuntuacion(getPlayerCourse())
    }
}
