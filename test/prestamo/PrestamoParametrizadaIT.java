/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */
@RunWith(value = org.junit.runners.Parameterized.class)
public class PrestamoParametrizadaIT {

    int cantidad;
    String cadena;

    public PrestamoParametrizadaIT(int cantidad, String cadena) {
        this.cadena = cadena;
        this.cantidad = cantidad;
    }

    @Parameters
    public static Iterable<Object> getData() {
        List<Object> obj = new ArrayList<>();

        obj.add(new Object[]{5000,"Felicidades, préstamo concedido"});
        obj.add(new Object[]{0,"Préstamo no concedido carece de interes"});
        obj.add(new Object[]{20000,"Préstamo no concedido es una operación con demasiado riesgo"});
        
        obj.add(new Object[]{999,"Préstamo no concedido carece de interes"});
        obj.add(new Object[]{1000,"Felicidades, préstamo concedido"});
        obj.add(new Object[]{15000,"Felicidades, préstamo concedido"});
        obj.add(new Object[]{15001,"Préstamo no concedido es una operación con demasiado riesgo"});
        return obj;
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void pruebaParametrica() {
        Prestamo instance = new Prestamo();
        String resultadoEsperado = cadena;
        String resultado = instance.estudio(cantidad);
        assertEquals(resultadoEsperado, resultado);
    }

}
