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
public class PrestamoEquivalenciaIT {

    public PrestamoEquivalenciaIT() {
    }

    // Casos de equivalencia
    /*
    1_1 - cantidad = 5000, sRespuesta = Felicidades, préstamo concedido.
    1_2 - cantidad = 0, sRespuesta = Préstamo no concedido carece de interes.
    1_3 - cantidad = 20000, sRespuesta = Préstamo no concedido es una operación con demasiado riesgo.
     */
    @Test
    public void test1_1() {
        int cantidad = 5000;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Felicidades, préstamo concedido";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test1_2() {
        int cantidad = 0;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Préstamo no concedido carece de interes";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void test1_3() {
        int cantidad = 20000;
        Prestamo instance = new Prestamo();
        String resultadoEsperado = "Préstamo no concedido es una operación con demasiado riesgo";
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

}
