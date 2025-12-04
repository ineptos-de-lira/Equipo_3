package com.equipo3.conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConversorLongitudTest {

  private static final double DELTA = 1e-6;

  @Test
  public void kilometrosAMetros() {
    ConversorLongitud c = new ConversorLongitud();
    double resultado = c.convertir(1.0, UnidadLongitud.KILOMETRO, UnidadLongitud.METRO);
    assertEquals(1000.0, resultado, DELTA);
  }

  @Test
  public void metrosACentimetros() {
    ConversorLongitud c = new ConversorLongitud();
    double resultado = c.convertir(3.0, UnidadLongitud.METRO, UnidadLongitud.CENTIMETRO);
    assertEquals(300.0, resultado, DELTA);
  }

  @Test
  public void idempotenciaMetrosAMetros() {
    ConversorLongitud c = new ConversorLongitud();
    double resultado = c.convertir(5.5, UnidadLongitud.METRO, UnidadLongitud.METRO);
    assertEquals(5.5, resultado, DELTA);
  }

  @Test
  public void metrosAPies() {
    ConversorLongitud c = new ConversorLongitud();
    double resultado = c.convertir(1.0, UnidadLongitud.METRO, UnidadLongitud.PIE);
    assertEquals(3.28084, resultado, 0.001); 
  }
}