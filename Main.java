package com.equipo3.conversor;

/**
 * Clase principal para probar los conversores de temperatura y masa.
 */
public class Main {

  /**
   * Punto de entrada de la aplicación.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {

    // ================= TEMPERATURA =================
    System.out.println("====== CONVERSOR DE TEMPERATURA ======\n");

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