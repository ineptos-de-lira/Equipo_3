package com.equipo3.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para el conversor de volumen.
 */
public class ConversorVolumenTest {

  /** Tolerancia para comparaciones en punto flotante. */
  private static final double DELTA = 1e-6;

  /**
   * Prueba la conversión de metros cúbicos a litros.
   */
  @Test
  public void metroCubicoALitros() {
    ConversorVolumen c = new ConversorVolumen();
    double resultado =
        c.convertir(1.0, UnidadVolumen.METRO_CUBICO, UnidadVolumen.LITRO);
    assertEquals(1000.0, resultado, DELTA);
  }

  /**
   * Prueba la conversión de litros a mililitros.
   */
  @Test
  public void litrosAMililitros() {
    ConversorVolumen c = new ConversorVolumen();
    double resultado =
        c.convertir(0.5, UnidadVolumen.LITRO, UnidadVolumen.MILILITRO);
    assertEquals(500.0, resultado, DELTA);
  }

  /**
   * Verifica que convertir de litros a litros regrese el mismo valor.
   */
  @Test
  public void idempotenciaLitrosALitros() {
    ConversorVolumen c = new ConversorVolumen();
    double resultado =
        c.convertir(3.3, UnidadVolumen.LITRO, UnidadVolumen.LITRO);
    assertEquals(3.3, resultado, DELTA);
  }
}

