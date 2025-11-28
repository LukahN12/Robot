package org.iesalandalus.programacion.robot.modelo;

import java.util.Objects;

public record Zona(int ancho, int alto) {
    private static final int ALTO_MINIMO = 10;
    private static final int ALTO_MAXIMO = 100;
    private static final int ANCHO_MINIMO = 10;
    private static final int ANCHO_MAXIMO = 100;

    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    public Zona() {
        this(ANCHO_MINIMO,ALTO_MINIMO);
    }

    public void validarAncho(int ancho){
        if (ancho < ANCHO_MINIMO || ancho > ANCHO_MAXIMO) {
            throw new IllegalArgumentException("Ancho no válido.");
        }
    }

    public void validarAlto(int alto){
        if (alto < ALTO_MINIMO || alto > ALTO_MAXIMO) {
            throw new IllegalArgumentException("Alto no válido.");
        }
    }

    public Coordenada getCentro() {
        return new Coordenada(ancho/2, alto/2);
    }

    public boolean pertenece(Coordenada coordenada) {
        Objects.requireNonNull(coordenada, "La coordenada no puede ser nula.");
        return (perteneceX(coordenada.x()) && perteneceY(coordenada.y()));
    }

    public boolean perteneceX(int x){
        return (x < ancho && x >= 0);
    }

    public boolean perteneceY(int y){
        return (y < alto && y >= 0);
    }
}
