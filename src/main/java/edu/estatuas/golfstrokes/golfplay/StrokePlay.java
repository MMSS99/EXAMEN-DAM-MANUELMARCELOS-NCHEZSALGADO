package edu.estatuas.golfstrokes.golfplay;

import java.util.Arrays;

public class StrokePlay implements GolfPlay {

    @Override
    public int calcularPuntuacion(Byte[] puntuacion){
        return Arrays.stream(puntuacion).mapToInt(x -> x).sum();
    }
}
