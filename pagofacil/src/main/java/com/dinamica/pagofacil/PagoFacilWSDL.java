/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinamica.pagofacil;

import javax.jws.WebService;

/**
 *
 * @author esisack
 */
@WebService(serviceName = "genericoMethodsService", portName = "genericoMethods", endpointInterface = "ar.com.sibs.genericows.operations.MethodsWS", targetNamespace = "http://operations.genericows.sibs.com.ar", wsdlLocation = "WEB-INF/wsdl/wsstandard-v5.wsdl")
public class PagoFacilWSDL {

    public ar.com.sibs.genericows.operationsdatatypes.DirectaResp directa(ar.com.sibs.genericows.datatypes.HeaderReq hdReq, ar.com.sibs.genericows.datatypes.Check check, java.lang.String utility, java.lang.String barCode, java.lang.String medioPago, java.lang.String creditCard, int amount) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public ar.com.sibs.genericows.operationsdatatypes.ReversaResp reversa(ar.com.sibs.genericows.datatypes.HeaderReq hdReq, java.lang.String terminalOriginal, java.lang.String cajeroOriginal, javax.xml.datatype.XMLGregorianCalendar fechaHoraOriginal, java.lang.String nroSecuenciaOriginal, java.lang.String tipoReversa, java.lang.String utility, int amount) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public ar.com.sibs.genericows.operationsdatatypes.ConsultaResp consulta(ar.com.sibs.genericows.datatypes.HeaderReq hdReq, java.lang.String utility, java.lang.String codBarra, java.lang.String codigoCliente) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
