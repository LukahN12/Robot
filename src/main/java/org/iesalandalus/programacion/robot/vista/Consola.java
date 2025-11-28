package org.iesalandalus.programacion.robot.vista;

import org.iesalandalus.programacion.robot.modelo.*;
import org.iesalandalus.programacion.utilidades.Entrada;
import java.util.Objects;

public class Consola {

    private Consola(){
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("MENU: [1]. controlar un robot por defecto");
        System.out.println("[2]. controlar un robot indicando su zona");
        System.out.println("[3]. controlar un robot indicando su zona y orientación");
        System.out.println("[4]. controlar un robot indicando su zona, orientación y coordenada inicial");
        System.out.println("[5]. Ejecutar comando");
        System.out.println("[6].Salir");
    }

    public static int elegirOpcion() {
        System.out.print("Que opción eliges?: ");
        int opcion;
        do {
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 6);
        return opcion;
    }

    public static Zona elegirZona() {
        int alto;
        int ancho;
        do {
            System.out.print("Introduce una altura valida (10 - 100): ");
            alto = Entrada.entero();
        } while (alto < 10 || alto > 100);

        do {
            System.out.print("Introduce una anchura valida (10 - 100): ");
            ancho = Entrada.entero();
        } while (ancho < 10 || ancho > 100);

        return new Zona(ancho, alto);
    }

    public static void mostrarMenuOrientacion() {
        System.out.println("Las orientaciones que puedes elegir son: 1.Norte, 2.Noreste, 3.Este, 4.Sureste, 5.Sur, 6.Suroeste, 7.Oeste, 8.Noroeste");
    }

    public static Orientacion elegirOrientacion(){
        Consola.mostrarMenuOrientacion();
        int eleccion;
        Orientacion orientacion = null;
        do {
            System.out.print("Elige alguna de las posibles orientaciones: ");
            eleccion = Entrada.entero();
        } while (eleccion < 1 || eleccion > 8);
        switch (eleccion) {
            case 1 -> orientacion = Orientacion.NORTE;
            case 2 -> orientacion = Orientacion.NORESTE;
            case 3 -> orientacion = Orientacion.ESTE;
            case 4 -> orientacion = Orientacion.SURESTE;
            case 5 -> orientacion = Orientacion.SUR;
            case 6 -> orientacion = Orientacion.SUROESTE;
            case 7 -> orientacion = Orientacion.OESTE;
            case 8 -> orientacion = Orientacion.NOROESTE;
        }
        return orientacion;
    }

    public static Coordenada elegirCoordenada() {
        int x;
        int y;
        System.out.println("Introduce las coordenadas:");

        System.out.print("Introduce la X: ");
        x = Entrada.entero();

        System.out.print("Introduce la Y: ");
        y = Entrada.entero();

        return new Coordenada(x, y);
    }

    public static char elegirComando() {
        char comando;
        System.out.print("Elige alguna de estos comandos: Derecha (D/d) Izquierda (I/i) o Avanzar (A/a): ");
        comando = Entrada.caracter();
        return comando;
    }

    public static void mostrarRobot(ControladorRobot controladorRobot) {
        Objects.requireNonNull(controladorRobot, "No hay ningún controlador!");
        System.out.println(controladorRobot.getRobot());
    }

    public static void despedirse() {
        System.out.println("Nos vemos!");
    }
}
