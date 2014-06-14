/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vista;

import interfaz.IParametro;
import interfaz.iProceso;
import tiposparametro.ParametroTipoA;
import tiposparametro.ParametroTipoB;

/**
 *
 * @author paul
 */
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        iProceso p1 = new ParametroTipoA();
        iProceso p2 = new ParametroTipoB();
        m.procesoA(p1);
        m.procesoA(p2);
    }

    public Main() {
    }

    public void procesoA(iProceso p) {
        //Llamada a metodos comunes a cualquier tipo de objeto recibido
        //iProceso proc = (iProceso) p;
        p.proceso1("abc");
        p.proceso2(10);
        /////
        
        
        
        if (p instanceof ParametroTipoA) {
            ParametroTipoA x = (ParametroTipoA) p;
            x.getApellidos();
            x.getNombres();
        }else if (p instanceof ParametroTipoB){
            ParametroTipoB x = (ParametroTipoB) p;
            x.getDescripcionProducto();
            x.getPrecio();
        }
    }
}
