
package ar.com.sibs.genericows.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.sibs.genericows.operationsdatatypes.ReversaResp;


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
 *         &lt;element name="reversaReturn" type="{http://operationsDataTypes.genericows.sibs.com.ar}ReversaResp"/>
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
    "reversaReturn"
})
@XmlRootElement(name = "reversaResponse")
public class ReversaResponse {

    @XmlElement(required = true)
    protected ReversaResp reversaReturn;

    /**
     * Gets the value of the reversaReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversaResp }
     *     
     */
    public ReversaResp getReversaReturn() {
        return reversaReturn;
    }

    /**
     * Sets the value of the reversaReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversaResp }
     *     
     */
    public void setReversaReturn(ReversaResp value) {
        this.reversaReturn = value;
    }

}
