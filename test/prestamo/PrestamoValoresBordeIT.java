/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PrestamoValoresBordeIT {

    public PrestamoValoresBordeIT() {
    }

    // Valores borde
    /*
    2_1 - cantidad = 999, sRespuesta = Préstamo no concedido carece de interes.
    2_2 - cantidad = 1000, sRespuesta = Felicidades, préstamo concedido.
    2_3 - cantidad = 15000, sRespuesta = Felicidades, préstamo concedido.
    2_4 - cantidad = 15001, sRespuesta = Préstamo no concedido es una operación con demasiado riesgo.
     */
    @Test
    public void test2_1() {
        int cantidad = 999;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Préstamo no concedido carece de interes";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test2_2() {
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Felicidades, préstamo concedido";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test2_3() {
        int cantidad = 15000;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Felicidades, préstamo concedido";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test2_4() {
        int cantidad = 15001;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Préstamo no concedido es una operación con demasiado riesgo";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

}
