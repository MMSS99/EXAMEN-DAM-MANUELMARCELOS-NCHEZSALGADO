package edu.estatuas.golfstrokes.scorecard;

import edu.estatuas.golfstrokes.courses.Course;
import edu.estatuas.golfstrokes.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScoreCard {

    Optional<Player> playerA;
    Optional<Player> playerB;
    Optional<Player> playerC;
    Optional<Player> playerD;

    Course playersCourse;

    //setters

    public void setPlayerA(Player playerA) {
        this.playerA = Optional.ofNullable(playerA);
    }

    public void setPlayerB(Player playerB) {
        this.playerB = Optional.ofNullable(playerB);
    }

    public void setPlayerC(Player playerC) {
        this.playerC = Optional.ofNullable(playerC);
    }

    public void setPlayerD(Player playerD) {
        this.playerD = Optional.ofNullable(playerD);
    }

    public void setPlayersCourse(Course playersCourse) {
        this.playersCourse = playersCourse;
    }


    //getters

    public byte[] getPlayerCourse(Player player) {
        return playersCourse.getPlayerCourse(player);
    }

    public List<Player> getPlayersPresentes(){
        Optional<Player>[] jugadores = new Optional[]{playerA, playerB, playerC, playerD};
        List<Player> presentes = new ArrayList<>();

        for (Optional<Player> jugador : jugadores) {
            if (jugador.isPresent()) {
                presentes.add(jugador.get());
            }
        }

        return presentes;
    }

}
