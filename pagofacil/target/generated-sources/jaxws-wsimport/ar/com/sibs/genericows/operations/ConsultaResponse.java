
package ar.com.sibs.genericows.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.sibs.genericows.operationsdatatypes.ConsultaResp;


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
 *         &lt;element name="consultaReturn" type="{http://operationsDataTypes.genericows.sibs.com.ar}ConsultaResp"/>
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
    "consultaReturn"
})
@XmlRootElement(name = "consultaResponse")
public class ConsultaResponse {

    @XmlElement(required = true)
    protected ConsultaResp consultaReturn;

    /**
     * Gets the value of the consultaReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaResp }
     *     
     */
    public ConsultaResp getConsultaReturn() {
        return consultaReturn;
    }

    /**
     * Sets the value of the consultaReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaResp }
     *     
     */
    public void setConsultaReturn(ConsultaResp value) {
        this.consultaReturn = value;
    }

}
