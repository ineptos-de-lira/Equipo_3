package com.equipo3.conversor;

/**
 * Clase principal para probar los conversores de tiempo, longitud, temperatura y masa.
 */
public class Main {

  /**
   * Punto de entrada de la aplicación.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {

    // ================= TIEMPO =================
    System.out.println("====== CONVERSOR DE TIEMPO ======\n");

    System.out.println("--- Conversión de Tiempo ---");
    ConversorTiempo cTiempo = new ConversorTiempo();

    double hAMin =
        cTiempo.convertir(2, UnidadTiempo.HORA, UnidadTiempo.MINUTO);
    double dAH =
        cTiempo.convertir(3, UnidadTiempo.DIA, UnidadTiempo.HORA);

    System.out.println("2 h = " + hAMin + " min");
    System.out.println("3 días = " + dAH + " h\n");

    // ================= LONGITUD =================
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
      double resultadoError =
          cLong.convertir(1.0, UnidadLongitud.METRO, UnidadLongitud.PIE);
      System.out.println("1 m = " + resultadoError + " pies");
    } catch (IllegalArgumentException e) {
      System.out.println(">> EXCEPCIÓN CAPTURADA: " + e.getMessage());
      System.out.println(">> (Esto demuestra el manejo de errores en longitud)");
    }

    // ================= TEMPERATURA =================
    System.out.println("\n====== CONVERSOR DE TEMPERATURA ======\n");

    System.out.println("--- Conversión de Temperatura ---");
    ConversorTemperatura cTemp = new ConversorTemperatura();

    double cAF =
        cTemp.convertir(25, UnidadTemperatura.CELSIUS, UnidadTemperatura.FAHRENHEIT);
    double kAC =
        cTemp.convertir(300, UnidadTemperatura.KELVIN, UnidadTemperatura.CELSIUS);

    System.out.println("25 °C = " + cAF + " °F");
    System.out.println("300 K = " + kAC + " °C\n");

    // ================= MASA =================
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