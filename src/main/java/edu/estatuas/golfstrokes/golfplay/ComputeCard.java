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

    public byte[] getPlayerCourse(Player player){
        return scorecard.getPlayersCourse().getPlayerCourse(player);
    }
}
