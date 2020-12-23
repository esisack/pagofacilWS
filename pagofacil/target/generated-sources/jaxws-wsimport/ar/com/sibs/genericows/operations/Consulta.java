
package ar.com.sibs.genericows.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.sibs.genericows.datatypes.HeaderReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hdReq" type="{http://dataTypes.genericows.sibs.com.ar}HeaderReq"/>
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cod_barra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hdReq",
    "utility",
    "codBarra",
    "codigoCliente"
})
@XmlRootElement(name = "consulta")
public class Consulta {

    @XmlElement(required = true)
    protected HeaderReq hdReq;
    @XmlElement(required = true)
    protected String utility;
    @XmlElement(name = "cod_barra", required = true)
    protected String codBarra;
    @XmlElement(name = "codigo_cliente", required = true)
    protected String codigoCliente;

    /**
     * Gets the value of the hdReq property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderReq }
     *     
     */
    public HeaderReq getHdReq() {
        return hdReq;
    }

    /**
     * Sets the value of the hdReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderReq }
     *     
     */
    public void setHdReq(HeaderReq value) {
        this.hdReq = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets the value of the codBarra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBarra() {
        return codBarra;
    }

    /**
     * Sets the value of the codBarra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBarra(String value) {
        this.codBarra = value;
    }

    /**
     * Gets the value of the codigoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the value of the codigoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

}
