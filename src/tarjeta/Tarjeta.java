/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjeta;
import java.util.Date;
/**
 *
 * @author cristian
 */
public class Tarjeta {

    public String nro_tarjeta="001";
    public int valor=150000;
    public Date ultimo_acceso = SimpleDateFormat("15/08/2020");
    public int ultimo_valor_pagado=1500;
    public String estacion="SANTA MONICA";
    public int torno=7;

    Tarjeta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Date SimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Tarjeta(String nro_tarjeta,int valor,Date ultimo_acceso, int ultimo_valor_pagado, String estacion,int torno){
        this.nro_tarjeta=nro_tarjeta;
        this.valor = valor;
        this.ultimo_acceso = ultimo_acceso;
        this.ultimo_valor_pagado=ultimo_valor_pagado;
        this.estacion=estacion;
        this.torno = torno;
           
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(Date ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public int getUltimo_valor_pagado() {
        return ultimo_valor_pagado;
    }

    public void setUltimo_valor_pagado(int ultimo_valor_pagado) {
        this.ultimo_valor_pagado = ultimo_valor_pagado;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public int getTorno() {
        return torno;
    }

    public void setTorno(int torno) {
        this.torno = torno;
    }
}
