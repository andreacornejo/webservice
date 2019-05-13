/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.ws;

import com.banco.cotizacion.Cotizacion;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jose
 */
@WebService(serviceName = "WSBanco")
public class WSBanco {

    /**
     * This is a sample web service operation
     */
    Cotizacion cotizacion = new Cotizacion();
    @WebMethod(operationName = "getCotizacion")
    public String getCotizacion(@WebParam(name = "fecha") String fecha) {
        return cotizacion.getCotizacion(fecha);
    }
    
    @WebMethod(operationName = "setCotizacion")
    public String setCotizacion(@WebParam(name = "fecha") String fecha,
                                @WebParam(name = "valor") double valor) {
        return cotizacion.setCotizacion(fecha, valor);
    }
}
