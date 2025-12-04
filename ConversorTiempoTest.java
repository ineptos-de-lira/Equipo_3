package com.equipo3.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para el conversor de tiempo.
 */
public class ConversorTiempoTest {

  /** Tolerancia para comparaciones en punto flotante. */
  private static final double DELTA = 1e-6;

  /**
   * Prueba la conversión de horas a minutos.
   */
  @Test
  public void horasAMinutos() {
    ConversorTiempo c = new ConversorTiempo();
    double resultado = c.convertir(2.0, UnidadTiempo.HORA, UnidadTiempo.MINUTO);
    assertEquals(120.0, resultado, DELTA);
  }

  /**
   * Prueba la conversión de días a horas.
   */
  @Test
  public void diasAHoras() {
    ConversorTiempo c = new ConversorTiempo();
    double resultado = c.convertir(1.0, UnidadTiempo.DIA, UnidadTiempo.HORA);
    assertEquals(24.0, resultado, DELTA);
  }

  /**
   * Verifica que convertir de segundos a segundos regrese el mismo valor.
   */
  @Test
  public void idempotenciaSegundosASegundos() {
    ConversorTiempo c = new ConversorTiempo();
    double resultado = c.convertir(90.0, UnidadTiempo.SEGUNDO, UnidadTiempo.SEGUNDO);
    assertEquals(90.0, resultado, DELTA);
  }
}
