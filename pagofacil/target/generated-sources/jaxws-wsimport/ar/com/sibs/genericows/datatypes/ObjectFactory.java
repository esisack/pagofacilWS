
package ar.com.sibs.genericows.datatypes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.sibs.genericows.datatypes package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.sibs.genericows.datatypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HeaderReq }
     * 
     */
    public HeaderReq createHeaderReq() {
        return new HeaderReq();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link HeaderResp }
     * 
     */
    public HeaderResp createHeaderResp() {
        return new HeaderResp();
    }

    /**
     * Create an instance of {@link ArrayFieldsQuerie }
     * 
     */
    public ArrayFieldsQuerie createArrayFieldsQuerie() {
        return new ArrayFieldsQuerie();
    }

}
