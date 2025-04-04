package edu.estatuas.golfstrokes.golfplay;

import com.google.common.primitives.Bytes;

import java.util.Arrays;
import java.util.List;

public class StrokePlay implements GolfPlay {

    @Override
    public int calcularPuntuacion(byte[] puntuacion){
        List<Byte> puntos = Bytes.asList(puntuacion);
        return puntos.stream().mapToInt(x -> x).sum();
    }
}
