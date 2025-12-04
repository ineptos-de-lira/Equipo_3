package com.equipo3.conversor;

/**
 * Conversor para unidades de volumen.
 */
public class ConversorVolumen {

  /**
   * Convierte un valor entre dos unidades de volumen.
   *
   * @param valor el valor a convertir
   * @param origen la unidad de origen
   * @param destino la unidad de destino
   * @return el valor convertido en la unidad destino
   */
  public double convertir(double valor,
                          UnidadVolumen origen,
                          UnidadVolumen destino) {
    double litros = aLitros(valor, origen);
    return desdeLitros(litros, destino);
  }

  private double aLitros(double v, UnidadVolumen u) {
    switch (u) {
      case LITRO:
        return v;
      case MILILITRO:
        return v * 0.001;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }

  private double desdeLitros(double l, UnidadVolumen u) {
    switch (u) {
      case LITRO:
        return l;
      case MILILITRO:
        return l / 0.001;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }
}
