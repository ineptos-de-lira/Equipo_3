package com.equipo3.conversor;

public class ConversorLongitud {

  /**
   * Convierte un valor entre dos unidades de longitud.
   *
   * @param valor  el valor a convertir
   * @param origen la unidad de origen
   * @param destino la unidad de destino
   * @return el valor convertido en la unidad destino
   */
  public double convertir(double valor,
                          UnidadLongitud origen,
                          UnidadLongitud destino) {
    double metros = aMetros(valor, origen);
    return desdeMetros(metros, destino);
  }

  private double aMetros(double valor, UnidadLongitud unidad) {
    switch (unidad) {
      case METRO:
        return valor;
      case CENTIMETRO:
        return valor * 0.01;
      case KILOMETRO:
        return valor * 1000.0;
      case PULGADA:
        return valor * 0.0254;
      case PIE:
        return valor * 0.3048;
      case YARDA:
        return valor * 0.9144;
      case MILLA:
        return valor * 1609.344;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }

  private double desdeMetros(double metros, UnidadLongitud unidad) {
    switch (unidad) {
      case METRO:
        return metros;
      case CENTIMETRO:
        return metros / 0.01;
      case KILOMETRO:
        return metros / 1000.0;
      case PULGADA:
        return metros / 0.0254;
      case PIE:
        return metros / 0.3048;
      case YARDA:
        return metros / 0.9144;
      case MILLA:
        return metros / 1609.344;
      default:
        throw new IllegalArgumentException("Unidad no soportada");
    }
  }
}
