package edu.estatuas.golfstrokes.golfplay;

import com.google.common.primitives.Bytes;
import edu.estatuas.golfstrokes.players.Player;
import edu.estatuas.golfstrokes.scorecard.ScoreCard;

import java.util.Arrays;
import java.util.List;

public class StrokePlay implements GolfPlay {

    @Override
    public void calcularPuntuacion(Player jugador, ScoreCard scorecard){
        List<Byte> puntos = Bytes.asList(scorecard.getPlayerCourse(jugador));
        jugador.setPuntosStrokeplay(puntos.stream().mapToInt(x -> x).sum());
    }
}
