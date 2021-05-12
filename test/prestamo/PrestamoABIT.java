/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PrestamoABIT {

    Prestamo instance;

    public PrestamoABIT() {
    }

    @Before
    public void Before() {
        System.out.println("-Before-");
        instance = new Prestamo();
    }

    @After
    public void After() {
        System.out.println("-After-");
    }

    // Casos de equivalencia

    @Test
    public void test1_1() {
        int cantidad = 5000;
        String resultadoEsperado = "Felicidades, préstamo concedido";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test1_2() {
        int cantidad = 0;
        String resultadoEsperado = "Préstamo no concedido carece de interes";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test1_3() {
        int cantidad = 20000;
        String resultadoEsperado = "Préstamo no concedido es una operación con demasiado riesgo";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    // Valores borde

    @Test
    public void test2_1() {
        int cantidad = 999;
        String resultadoEsperado = "Préstamo no concedido carece de interes";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test2_2() {
        int cantidad = 1000;
        String resultadoEsperado = "Felicidades, préstamo concedido";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test2_3() {
        int cantidad = 15000;
        String resultadoEsperado = "Felicidades, préstamo concedido";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test2_4() {
        int cantidad = 15001;
        String resultadoEsperado = "Préstamo no concedido es una operación con demasiado riesgo";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }


}
