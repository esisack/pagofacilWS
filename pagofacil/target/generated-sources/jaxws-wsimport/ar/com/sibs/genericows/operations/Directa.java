
package ar.com.sibs.genericows.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.sibs.genericows.datatypes.Check;
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
 *         &lt;element name="check" type="{http://dataTypes.genericows.sibs.com.ar}Check"/>
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medioPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "check",
    "utility",
    "barCode",
    "medioPago",
    "creditCard",
    "amount"
})
@XmlRootElement(name = "directa")
public class Directa {

    @XmlElement(required = true)
    protected HeaderReq hdReq;
    @XmlElement(required = true)
    protected Check check;
    @XmlElement(required = true)
    protected String utility;
    @XmlElement(required = true)
    protected String barCode;
    @XmlElement(required = true)
    protected String medioPago;
    @XmlElement(required = true)
    protected String creditCard;
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
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
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
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the medioPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * Sets the value of the medioPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioPago(String value) {
        this.medioPago = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCard(String value) {
        this.creditCard = value;
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
