package com.equipo3.conversor;

/**
 * Clase principal para probar el conversor de volumen.
 */
public class Main {

  /**
   * Punto de entrada de la aplicación.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    System.out.println("====== CONVERSOR DE VOLUMEN ======\n");

    System.out.println("--- Conversión de Volumen ---");
    ConversorVolumen cVol = new ConversorVolumen();

    double lAMl =
        cVol.convertir(0.75, UnidadVolumen.LITRO, UnidadVolumen.MILILITRO);
    double m3AL =
        cVol.convertir(1, UnidadVolumen.METRO_CUBICO, UnidadVolumen.LITRO);

    System.out.println("0.75 L = " + lAMl + " mL");
    System.out.println("1 m³ = " + m3AL + " L\n");

    System.out.println("====== FIN DEL PROGRAMA ======");
  }
}

