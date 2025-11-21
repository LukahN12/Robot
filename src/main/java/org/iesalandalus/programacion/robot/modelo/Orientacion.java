package org.iesalandalus.programacion.robot.modelo;

public enum Orientacion {
    NORTE("Norte"),
    SUR("Sur"),
    ESTE("Este"),
    OESTE("Oeste"),
    SURESTE("Sureste"),
    SUROESTE("Suroeste"),
    NORESTE("Noreste"),
    NOROESTE("Noroeste");

    private final String nombre;

    Orientacion (String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
