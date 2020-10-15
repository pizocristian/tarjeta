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

    public String nro_tarjeta;
    public int valor;
    public Date ultimo_acceso;
    public int ultimo_valor_pagado;
    public String estacion;
    public int torno;

     public Tarjeta() {
    nro_tarjeta="001";
    valor=150000;
    ultimo_acceso = new Date();
    ultimo_valor_pagado=1500;
    estacion="SANTA MONICA";
    torno=7;
        
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