
package ar.com.sibs.genericows.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.sibs.genericows.operationsdatatypes.DirectaResp;


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
 *         &lt;element name="directaReturn" type="{http://operationsDataTypes.genericows.sibs.com.ar}DirectaResp"/>
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
    "directaReturn"
})
@XmlRootElement(name = "directaResponse")
public class DirectaResponse {

    @XmlElement(required = true)
    protected DirectaResp directaReturn;

    /**
     * Gets the value of the directaReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DirectaResp }
     *     
     */
    public DirectaResp getDirectaReturn() {
        return directaReturn;
    }

    /**
     * Sets the value of the directaReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectaResp }
     *     
     */
    public void setDirectaReturn(DirectaResp value) {
        this.directaReturn = value;
    }

}
