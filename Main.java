package com.equipo3.conversor;

public class Main {

  /**
   * Punto de entrada 
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("====== CONVERSOR DE LONGITUD ======\n");

    System.out.println("--- Conversión de Longitud ---");
    ConversorLongitud cLong = new ConversorLongitud();

    double kmAM =
        cLong.convertir(1.0, UnidadLongitud.KILOMETRO, UnidadLongitud.METRO);
    double mACm =
        cLong.convertir(2.5, UnidadLongitud.METRO, UnidadLongitud.CENTIMETRO);

    System.out.println("1 km = " + kmAM + " m");
    System.out.println("2.5 m = " + mACm + " cm");

    System.out.println("\n--- Prueba de Error Intencional (Metros a Pies) ---");
    try {
        double resultadoError = cLong.convertir(1.0, UnidadLongitud.METRO, UnidadLongitud.PIE);
        System.out.println("1 m = " + resultadoError + " pies");
    } catch (IllegalArgumentException e) {
        System.out.println(">> EXCEPCIÓN CAPTURADA: " + e.getMessage());
        System.out.println(">> (Esto demuestra que falta la lógica para PIE)");
    }

    System.out.println("\nFIN DEL PROGRAMA");
  }
}