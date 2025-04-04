package edu.estatuas.golfstrokes.golfplay;

import edu.estatuas.golfstrokes.players.Player;
import edu.estatuas.golfstrokes.scorecard.ScoreCard;

import java.util.List;

public class ComputeCard {

    ScoreCard scorecard;
    GolfPlay modalidad;

    public ComputeCard(ScoreCard scorecard, GolfPlay modalidad) {
        this.scorecard = scorecard;
        this.modalidad = modalidad;
    }

    // hay que traer a los jugadores presentes en la scorecard

    public void compute(){
        List<Player> jugadorespresentes = scorecard.getPlayersPresentes();

        //meter esto en un if que vea el tipo de clase de modalidad
        for (Player jugador : jugadorespresentes){
            modalidad.calcularPuntuacion(jugador, scorecard);
        }
    }
}
