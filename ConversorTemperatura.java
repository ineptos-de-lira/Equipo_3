package com.equipo3.conversor;

/**
 * Conversor para unidades de temperatura.
 */
public class ConversorTemperatura {

  /**
   * Convierte un valor entre dos unidades de temperatura.
   *
   * @param valor el valor a convertir
   * @param origen la unidad de origen
   * @param destino la unidad de destino
   * @return el valor convertido en la unidad destino
   */
  public double convertir(double valor,
                          UnidadTemperatura origen,
                          UnidadTemperatura destino) {
    double c = aCelsius(valor, origen);
    return desdeCelsius(c, destino);
  }

  private double aCelsius(double v, UnidadTemperatura u) {
    switch (u) {
      case CELSIUS:
        return v;
      case FAHRENHEIT:
        return v - 32 * 5 / 9;
      case KELVIN:
        return v - 273.15;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }

  private double desdeCelsius(double c, UnidadTemperatura u) {
    switch (u) {
      case CELSIUS:
        return c;
      case FAHRENHEIT:
        return c * 9 / 5 + 32;
      case KELVIN:
        return c + 273.15;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }
}
