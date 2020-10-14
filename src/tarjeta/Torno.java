
package tarjeta;

import java.util.Date;

public class Torno {

private String nro_tarjeta;
    private int valor = 1500;
    public int nuevo_valor=0;
    private String estacion = "CIUDAD CALI";
    private int torno = 8;
    /**
     * @param args the command line arguments
     */
     Tarjeta t=new Tarjeta();
    public static void main(String[] args) {      
        Tarjeta t=new Tarjeta();
        Torno torno=new Torno();
        torno.llenar_tarjeta();
        System.out.print("nro_tarjeta: "+t.getNro_tarjeta()+", valor: "+t.getValor()+", Ultimo_acceso: "+t.getUltimo_acceso()+", Ultimo_valor_pagado: "+t.getUltimo_valor_pagado()+", Estación: "+t.getEstacion()+", torno:"+t.getTorno());
    }
    
    public void llenar_tarjeta(){
        
        nuevo_valor= t.getValor()-valor;
        t.setValor(nuevo_valor);
        t.setUltimo_acceso(new Date());
        t.setUltimo_valor_pagado(valor);
        t.setEstacion(estacion);
        t.setTorno(torno);
    }
}
