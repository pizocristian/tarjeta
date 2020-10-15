
package tarjeta;

import java.util.Date;

public class Torno {

private String nro_tarjeta;

    public static void main(String[] args) {  
        Tarjeta t=new Tarjeta();
        t.setValor(t.valor-1500);
        t.setUltimo_acceso(new Date());
        t.setUltimo_valor_pagado(1500);
        t.setEstacion("CIUDAD CALI");
        t.setTorno(8);
        System.out.print("nro_tarjeta: "+t.getNro_tarjeta()+", valor: "+t.getValor()+", Ultimo_acceso: "+t.getUltimo_acceso()+", Ultimo_valor_pagado: "+t.getUltimo_valor_pagado()+", Estación: "+t.getEstacion()+", torno:"+t.getTorno());
    }
   
}
