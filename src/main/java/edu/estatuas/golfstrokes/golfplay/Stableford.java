package edu.estatuas.golfstrokes.golfplay;

import edu.estatuas.golfstrokes.players.Player;
import edu.estatuas.golfstrokes.scorecard.Hole;
import edu.estatuas.golfstrokes.scorecard.ScoreCard;

import java.util.List;

public class Stableford implements GolfPlay{

    @Override
    public void calcularPuntuacion(Player jugador, ScoreCard scorecard){
        int puntuacionAcumulada = 0;
        int parComparado = 0;
        byte[] puntuacionjugador = scorecard.getPlayerCourse(jugador);
        List<Hole> hoyos = scorecard.getHoles();
        for (int i = 0; i < puntuacionjugador.length; i++) {
            parComparado = hoyos.get(i).getPar() - puntuacionjugador[i];

            if (parComparado < -1){
                puntuacionAcumulada = puntuacionAcumulada + StablefordSystem.DOUBLE_BOGEY.getPoints();
            } else if (parComparado == -1){
                puntuacionAcumulada = puntuacionAcumulada + StablefordSystem.BOGEY.getPoints();
            } else if (parComparado == 0){
                puntuacionAcumulada = puntuacionAcumulada + StablefordSystem.PAR.getPoints();
            } else if (parComparado == 1){
                puntuacionAcumulada = puntuacionAcumulada + StablefordSystem.BIRDIE.getPoints();
            } else if (parComparado == 2){
                puntuacionAcumulada = puntuacionAcumulada + StablefordSystem.EAGLE.getPoints();
            } else if (parComparado > 2){
                puntuacionAcumulada = puntuacionAcumulada + StablefordSystem.ALBATROSS.getPoints();
            }
        }

        jugador.setPuntosStableford(puntuacionAcumulada);
    }
}
