package com.equipo3.conversor;

/**
 * Conversor para unidades de tiempo.
 */
public class ConversorTiempo {

  /**
   * Convierte un valor entre dos unidades de tiempo.
   *
   * @param valor el valor a convertir
   * @param origen la unidad de origen
   * @param destino la unidad de destino
   * @return el valor convertido en la unidad destino
   */
  public double convertir(double valor,
                          UnidadTiempo origen,
                          UnidadTiempo destino) {
    double s = aSegundos(valor, origen);
    return desdeSegundos(s, destino);
  }

  private double aSegundos(double v, UnidadTiempo u) {
    switch (u) {
      case SEGUNDO:
        return v;
      case MINUTO:
        return v * 60;
      case HORA:
        return v * 3600;
      case DIA:
        return v * 86400;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }

  private double desdeSegundos(double s, UnidadTiempo u) {
    switch (u) {
      case SEGUNDO:
        return s;
      case MINUTO:
        return s / 60;
      case HORA:
        return s / 3600;
      case DIA:
        return s / 86400;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }
}
