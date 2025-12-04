package com.equipo3.conversor;

/**
 * Clase principal para probar los conversores de temperatura y masa.
 */
public class Main {

  /**
   * Punto de entrada 
   *
   * @param args argumentos de la línea de comandos
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

    System.out.println("\nFIN DEL PROGRAMA (Sección Longitud)");

    //TEMPERATURA 
    System.out.println("\n====== CONVERSOR DE TEMPERATURA ======\n");

    System.out.println("--- Conversión de Temperatura ---");
    ConversorTemperatura cTemp = new ConversorTemperatura();

    double cAF =
        cTemp.convertir(25, UnidadTemperatura.CELSIUS, UnidadTemperatura.FAHRENHEIT);
    double kAC =
        cTemp.convertir(300, UnidadTemperatura.KELVIN, UnidadTemperatura.CELSIUS);

    System.out.println("25 °C = " + cAF + " °F");
    System.out.println("300 K = " + kAC + " °C\n");

    //MASA
    System.out.println("====== CONVERSOR DE MASA ======\n");

    System.out.println("--- Conversión de Masa ---");
    ConversorMasa cMasa = new ConversorMasa();

    double gAKg =
        cMasa.convertir(750, UnidadMasa.GRAMO, UnidadMasa.KILOGRAMO);
    double kgALb =
        cMasa.convertir(1, UnidadMasa.KILOGRAMO, UnidadMasa.LIBRA);

    System.out.println("750 g = " + gAKg + " kg");
    System.out.println("1 kg = " + kgALb + " lb\n");

    System.out.println("====== FIN DEL PROGRAMA ======");
  }
}