
package ar.com.sibs.genericows.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="terminalOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cajeroOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaHoraOriginal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nroSecuenciaOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoReversa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "terminalOriginal",
    "cajeroOriginal",
    "fechaHoraOriginal",
    "nroSecuenciaOriginal",
    "tipoReversa",
    "utility",
    "amount"
})
@XmlRootElement(name = "reversa")
public class Reversa {

    @XmlElement(required = true)
    protected HeaderReq hdReq;
    @XmlElement(required = true)
    protected String terminalOriginal;
    @XmlElement(required = true)
    protected String cajeroOriginal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraOriginal;
    @XmlElement(required = true)
    protected String nroSecuenciaOriginal;
    @XmlElement(required = true)
    protected String tipoReversa;
    @XmlElement(required = true)
    protected String utility;
    protected int amount;

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
     * Gets the value of the terminalOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalOriginal() {
        return terminalOriginal;
    }

    /**
     * Sets the value of the terminalOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalOriginal(String value) {
        this.terminalOriginal = value;
    }

    /**
     * Gets the value of the cajeroOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCajeroOriginal() {
        return cajeroOriginal;
    }

    /**
     * Sets the value of the cajeroOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCajeroOriginal(String value) {
        this.cajeroOriginal = value;
    }

    /**
     * Gets the value of the fechaHoraOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraOriginal() {
        return fechaHoraOriginal;
    }

    /**
     * Sets the value of the fechaHoraOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraOriginal(XMLGregorianCalendar value) {
        this.fechaHoraOriginal = value;
    }

    /**
     * Gets the value of the nroSecuenciaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSecuenciaOriginal() {
        return nroSecuenciaOriginal;
    }

    /**
     * Sets the value of the nroSecuenciaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSecuenciaOriginal(String value) {
        this.nroSecuenciaOriginal = value;
    }

    /**
     * Gets the value of the tipoReversa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoReversa() {
        return tipoReversa;
    }

    /**
     * Sets the value of the tipoReversa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoReversa(String value) {
        this.tipoReversa = value;
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
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

}
