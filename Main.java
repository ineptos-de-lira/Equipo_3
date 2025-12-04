package com.equipo3.conversor;

/**
 * Clase principal para probar el conversor de tiempo.
 */
public class Main {

  /**
   * Punto de entrada de la aplicación.
   *
   * @param args argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    System.out.println("====== CONVERSOR DE TIEMPO ======\n");

    System.out.println("--- Conversión de Tiempo ---");
    ConversorTiempo cTiempo = new ConversorTiempo();

    double hAMin =
        cTiempo.convertir(2, UnidadTiempo.HORA, UnidadTiempo.MINUTO);
    double dAH =
        cTiempo.convertir(3, UnidadTiempo.DIA, UnidadTiempo.HORA);

    System.out.println("2 h = " + hAMin + " min");
    System.out.println("3 días = " + dAH + " h\n");

    System.out.println("====== FIN DEL PROGRAMA ======");
  }
}
