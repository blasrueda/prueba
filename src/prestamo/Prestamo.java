/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
}


/*
RESPONDER AQUI EL PUNTO 1 DEL EXÁMEN.

-Casos de equivalencia:
1_1 - cantidad = 5000, sRespuesta = Felicidades, préstamo concedido.
1_2 - cantidad = 0, sRespuesta = Préstamo no concedido carece de interes.
1_3 - cantidad = 20000, sRespuesta = Préstamo no concedido es una operación con demasiado riesgo.
-Valores borde:
2_1 - cantidad = 999, sRespuesta = Préstamo no concedido carece de interes.
2_2 - cantidad = 1000, sRespuesta = Felicidades, préstamo concedido.
2_3 - cantidad = 15000, sRespuesta = Felicidades, préstamo concedido.
2_4 - cantidad = 15001, sRespuesta = Préstamo no concedido es una operación con demasiado riesgo.
*/