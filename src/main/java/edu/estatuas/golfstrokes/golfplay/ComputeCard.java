package edu.estatuas.golfstrokes.golfplay;

import edu.estatuas.golfstrokes.scorecard.ScoreCard;

public class ComputeCard {

    ScoreCard scorecard;
    GolfPlay modalidad;

    ComputeCard(ScoreCard scorecard, GolfPlay modalidad) {
        this.scorecard = scorecard;
        this.modalidad = modalidad;
    }
}
