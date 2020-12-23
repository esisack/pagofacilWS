
package ar.com.sibs.genericows.operations;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ar.com.sibs.genericows.datatypes.Check;
import ar.com.sibs.genericows.datatypes.HeaderReq;
import ar.com.sibs.genericows.operationsdatatypes.ConsultaResp;
import ar.com.sibs.genericows.operationsdatatypes.DirectaResp;
import ar.com.sibs.genericows.operationsdatatypes.ReversaResp;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MethodsWS", targetNamespace = "http://operations.genericows.sibs.com.ar")
@XmlSeeAlso({
    ar.com.sibs.genericows.datatypes.ObjectFactory.class,
    ar.com.sibs.genericows.operations.ObjectFactory.class,
    ar.com.sibs.genericows.operationsdatatypes.ObjectFactory.class
})
public interface MethodsWS {


    /**
     * 
     * @param amount
     * @param utility
     * @param hdReq
     * @param check
     * @param medioPago
     * @param creditCard
     * @param barCode
     * @return
     *     returns ar.com.sibs.genericows.operationsdatatypes.DirectaResp
     */
    @WebMethod
    @WebResult(name = "directaReturn", targetNamespace = "http://operations.genericows.sibs.com.ar")
    @RequestWrapper(localName = "directa", targetNamespace = "http://operations.genericows.sibs.com.ar", className = "ar.com.sibs.genericows.operations.Directa")
    @ResponseWrapper(localName = "directaResponse", targetNamespace = "http://operations.genericows.sibs.com.ar", className = "ar.com.sibs.genericows.operations.DirectaResponse")
    public DirectaResp directa(
        @WebParam(name = "hdReq", targetNamespace = "http://operations.genericows.sibs.com.ar")
        HeaderReq hdReq,
        @WebParam(name = "check", targetNamespace = "http://operations.genericows.sibs.com.ar")
        Check check,
        @WebParam(name = "utility", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String utility,
        @WebParam(name = "barCode", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String barCode,
        @WebParam(name = "medioPago", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String medioPago,
        @WebParam(name = "creditCard", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String creditCard,
        @WebParam(name = "amount", targetNamespace = "http://operations.genericows.sibs.com.ar")
        int amount);

    /**
     * 
     * @param tipoReversa
     * @param amount
     * @param terminalOriginal
     * @param cajeroOriginal
     * @param fechaHoraOriginal
     * @param nroSecuenciaOriginal
     * @param utility
     * @param hdReq
     * @return
     *     returns ar.com.sibs.genericows.operationsdatatypes.ReversaResp
     */
    @WebMethod
    @WebResult(name = "reversaReturn", targetNamespace = "http://operations.genericows.sibs.com.ar")
    @RequestWrapper(localName = "reversa", targetNamespace = "http://operations.genericows.sibs.com.ar", className = "ar.com.sibs.genericows.operations.Reversa")
    @ResponseWrapper(localName = "reversaResponse", targetNamespace = "http://operations.genericows.sibs.com.ar", className = "ar.com.sibs.genericows.operations.ReversaResponse")
    public ReversaResp reversa(
        @WebParam(name = "hdReq", targetNamespace = "http://operations.genericows.sibs.com.ar")
        HeaderReq hdReq,
        @WebParam(name = "terminalOriginal", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String terminalOriginal,
        @WebParam(name = "cajeroOriginal", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String cajeroOriginal,
        @WebParam(name = "fechaHoraOriginal", targetNamespace = "http://operations.genericows.sibs.com.ar")
        XMLGregorianCalendar fechaHoraOriginal,
        @WebParam(name = "nroSecuenciaOriginal", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String nroSecuenciaOriginal,
        @WebParam(name = "tipoReversa", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String tipoReversa,
        @WebParam(name = "utility", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String utility,
        @WebParam(name = "amount", targetNamespace = "http://operations.genericows.sibs.com.ar")
        int amount);

    /**
     * 
     * @param codBarra
     * @param codigoCliente
     * @param utility
     * @param hdReq
     * @return
     *     returns ar.com.sibs.genericows.operationsdatatypes.ConsultaResp
     */
    @WebMethod
    @WebResult(name = "consultaReturn", targetNamespace = "http://operations.genericows.sibs.com.ar")
    @RequestWrapper(localName = "consulta", targetNamespace = "http://operations.genericows.sibs.com.ar", className = "ar.com.sibs.genericows.operations.Consulta")
    @ResponseWrapper(localName = "consultaResponse", targetNamespace = "http://operations.genericows.sibs.com.ar", className = "ar.com.sibs.genericows.operations.ConsultaResponse")
    public ConsultaResp consulta(
        @WebParam(name = "hdReq", targetNamespace = "http://operations.genericows.sibs.com.ar")
        HeaderReq hdReq,
        @WebParam(name = "utility", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String utility,
        @WebParam(name = "cod_barra", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String codBarra,
        @WebParam(name = "codigo_cliente", targetNamespace = "http://operations.genericows.sibs.com.ar")
        String codigoCliente);

}
