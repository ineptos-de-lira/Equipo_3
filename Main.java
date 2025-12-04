package com.equipo3.conversor;

/**
 * Clase principal para probar el conversor de temperatura.
 */
public class Main {

  /**
   * Punto de entrada de la aplicación.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    System.out.println("====== CONVERSOR DE TEMPERATURA ======\n");

    System.out.println("--- Conversión de Temperatura ---");
    ConversorTemperatura cTemp = new ConversorTemperatura();

    double cAF =
        cTemp.convertir(25, UnidadTemperatura.CELSIUS, UnidadTemperatura.FAHRENHEIT);
    double kAC =
        cTemp.convertir(300, UnidadTemperatura.KELVIN, UnidadTemperatura.CELSIUS);

    System.out.println("25 °C = " + cAF + " °F");
    System.out.println("300 K = " + kAC + " °C\n");

    System.out.println("====== FIN DEL PROGRAMA ======");
  }
}
