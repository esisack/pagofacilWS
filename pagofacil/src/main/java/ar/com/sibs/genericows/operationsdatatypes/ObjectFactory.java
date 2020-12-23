
package ar.com.sibs.genericows.operationsdatatypes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.sibs.genericows.operationsdatatypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.sibs.genericows.operationsdatatypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaResp }
     * 
     */
    public ConsultaResp createConsultaResp() {
        return new ConsultaResp();
    }

    /**
     * Create an instance of {@link ReversaResp }
     * 
     */
    public ReversaResp createReversaResp() {
        return new ReversaResp();
    }

    /**
     * Create an instance of {@link DirectaResp }
     * 
     */
    public DirectaResp createDirectaResp() {
        return new DirectaResp();
    }

}
