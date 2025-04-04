package edu.estatuas.golfstrokes.golfplay;

import edu.estatuas.golfstrokes.players.Player;
import edu.estatuas.golfstrokes.scorecard.ScoreCard;

public interface GolfPlay {

    public void calcularPuntuacion(Player jugador, ScoreCard scorecard);
}
