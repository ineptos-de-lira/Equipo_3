package com.equipo3.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para el conversor de temperatura.
 */
public class ConversorTemperaturaTest {

  /** Tolerancia para comparaciones en punto flotante. */
  private static final double DELTA = 1e-6;

  /**
   * Prueba la conversión de Celsius a Kelvin.
   */
  @Test
  public void celsiusAKelvin() {
    ConversorTemperatura c = new ConversorTemperatura();
    double resultado =
        c.convertir(0.0, UnidadTemperatura.CELSIUS, UnidadTemperatura.KELVIN);
    assertEquals(273.15, resultado, DELTA);
  }

  /**
   * Prueba la conversión de Fahrenheit a Celsius.
   */
  @Test
  public void fahrenheitACelsius() {
    ConversorTemperatura c = new ConversorTemperatura();
    double resultado =
        c.convertir(32.0, UnidadTemperatura.FAHRENHEIT, UnidadTemperatura.CELSIUS);
    assertEquals(0.0, resultado, DELTA);
  }

  /**
   * Verifica que una ida y vuelta Celsius → Fahrenheit → Celsius conserva el valor.
   */
  @Test
  public void cicloCelsiusAFahrenheitYCelsius() {
    ConversorTemperatura c = new ConversorTemperatura();
    double valorOriginal = 25.0;

    double f = c.convertir(valorOriginal,
        UnidadTemperatura.CELSIUS,
        UnidadTemperatura.FAHRENHEIT);

    double c2 = c.convertir(f,
        UnidadTemperatura.FAHRENHEIT,
        UnidadTemperatura.CELSIUS);

    assertEquals(valorOriginal, c2, 1e-5);
  }
}
