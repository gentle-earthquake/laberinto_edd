/**
 * Clase Main para ejecutar el laberinto.
 * 
 * @author gentle_eartquake
 * @author Wallsified
 * @version 1.0
 */
public class Main {

    /**
     * Main del Programa usando entrada estandar de la terminal. 
     * 
     * @param args Ancho y Largo del Laberinto
     */
    public static void main(String[] args) {
        // Laberinto.start();
        int alto = Integer.parseInt(args[0]);
        int ancho = Integer.parseInt(args[1]);
        Laberinto laberinto = new Laberinto(alto, ancho);
        laberinto.verLaberinto();
    }
}