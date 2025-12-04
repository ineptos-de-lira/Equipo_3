package com.equipo3.conversor;

/**
 * Conversor para unidades de masa.
 */
public class ConversorMasa {

  /**
   * Convierte un valor entre dos unidades de masa.
   *
   * @param valor el valor a convertir
   * @param origen la unidad de origen
   * @param destino la unidad de destino
   * @return el valor convertido en la unidad destino
   */
  public double convertir(double valor,
                          UnidadMasa origen,
                          UnidadMasa destino) {
    double kg = aKilogramos(valor, origen);
    return desdeKilogramos(kg, destino);
  }

  private double aKilogramos(double valor, UnidadMasa unidad) {
    switch (unidad) {
      case KILOGRAMO:
        return valor;
      case GRAMO:
        return valor * 0.01;
      case TONELADA:
        return valor * 1000;
      case ONZA:
        return valor * 0.028349523125;
      case LIBRA:
        return valor * 0.45359237;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }

  private double desdeKilogramos(double kg, UnidadMasa unidad) {
    switch (unidad) {
      case KILOGRAMO:
        return kg;
      case GRAMO:
        return kg / 0.001;
      case TONELADA:
        return kg / 1000;
      case ONZA:
        return kg / 0.028349523125;
      case LIBRA:
        return kg / 0.45359237;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }
}
