package org.iesalandalus.programacion.robot.modelo;

public record Zona(int ancho, int alto) {
    private final static int ANCHO_MAXIMO = 100;
    private final static int ANCHO_MINIMO = 10;
    private final static int ALTO_MAXIMO = 100;
    private final static int ALTO_MINIMO = 10;

    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    public Zona() {
        this.(ancho,alto);
    }

    public void validarAncho(int ancho){
        if (ancho < ANCHO_MINIMO) {
            throw new IllegalArgumentException("El valor de ancho es menor que el mínimo permitido");
        } else if (ancho > ANCHO_MAXIMO) {
            throw new IllegalArgumentException("El valor de ancho es mayor que el maximo permitido");
        }
    }

    public void validarAlto(int alto){
        if (alto < ALTO_MINIMO) {
            throw new IllegalArgumentException("El valor de alto es menor que el mínimo permitido");
        } else if (alto > ALTO_MAXIMO) {
            throw new IllegalArgumentException("El valor de alto es mayor que el maximo permitido");
        }
    }

    public Coordenada getCentro() {
        System.out.println("El centro se encuentra en" + ancho/2 + " y " + alto/2);
    }

    public
}
