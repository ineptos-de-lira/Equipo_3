package com.equipo3.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para el conversor de masa.
 */
public class ConversorMasaTest {

  /** Tolerancia para comparaciones en punto flotante. */
  private static final double DELTA = 1e-6;

  /**
   * Prueba la conversión de gramos a kilogramos.
   */
  @Test
  public void gramosAKilogramos() {
    ConversorMasa c = new ConversorMasa();
    double resultado = c.convertir(1000.0, UnidadMasa.GRAMO, UnidadMasa.KILOGRAMO);
    assertEquals(1.0, resultado, DELTA);
  }

  /**
   * Prueba la conversión de kilogramos a libras.
   */
  @Test
  public void kilogramosALibras() {
    ConversorMasa c = new ConversorMasa();
    double resultado = c.convertir(1.0, UnidadMasa.KILOGRAMO, UnidadMasa.LIBRA);
    assertEquals(2.2046226, resultado, 1e-5);
  }

  /**
   * Verifica que convertir de kilogramos a kilogramos regresa el mismo valor.
   */
  @Test
  public void idempotenciaKilogramoAKilogramo() {
    ConversorMasa c = new ConversorMasa();
    double resultado = c.convertir(3.2, UnidadMasa.KILOGRAMO, UnidadMasa.KILOGRAMO);
    assertEquals(3.2, resultado, DELTA);
  }
}
