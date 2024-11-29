package revisionDeCodigo4;
/*Se retira package com.generation;*/

/* Se importa java.util.Scanner */
import java.util.Scanner;

public class Codigo4 {
  /* Se agrega el método principal */
  public static void main(String[] args) {
    /* Se corrige Scanner */
    Scanner scanner = new Scanner(System.in);

    /* Se solicitan jugadas a los jugadores */
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String jugador1 = scanner.nextLine().toLowerCase(); /* Se redacta con minúsculas para evitar errores de mayúsculas/minúsculas */

    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String jugador2 = scanner.nextLine().toLowerCase();

    /* Se validan las entradas */
    if (!esJugadaValida(jugador1) || !esJugadaValida(jugador2)) {
      System.out.println("Error: Ambas jugadas deben ser 'piedra', 'papel' o 'tijeras'.");
      return; /* Se termina el programa si hay entradas no válidas */
    }

    /* Se determina el resultado */
    if (jugador1.equals(jugador2)) {
      System.out.println("Empate");
    } else {
      int ganador = determinarGanador(jugador1, jugador2);
      System.out.println("Gana el jugador " + ganador);
    }

    scanner.close(); /* Aquí se cierra el Scanner */
  }

  /* Método para validar si una jugada es válida. */
  private static boolean esJugadaValida(String jugada) {
    return jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijeras");
  }

  /**
   * Método para determinar el ganador.
   * 
   * @param j1 Jugada del jugador 1.
   * @param j2 Jugada del jugador 2.
   * @return El número del jugador ganador (1 o 2).
   */
  private static int determinarGanador(String j1, String j2) {
    if (j1.equals("piedra") && j2.equals("tijeras") ||
        j1.equals("papel") && j2.equals("piedra") ||
        j1.equals("tijeras") && j2.equals("papel")) {
      return 1; // Gana el jugador 1
    } else {
      return 2; // Gana el jugador 2
    }
  }
}
