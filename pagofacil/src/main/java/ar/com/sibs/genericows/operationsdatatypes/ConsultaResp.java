
package ar.com.sibs.genericows.operationsdatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.sibs.genericows.datatypes.HeaderResp;
import ar.com.sibs.genericows.operations.ArrayOfTns1ArrayFieldsQuerie;


/**
 * <p>Java class for ConsultaResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cob_cliente_nomb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fields" type="{http://operations.genericows.sibs.com.ar}ArrayOf_tns1_ArrayFieldsQuerie"/>
 *         &lt;element name="header" type="{http://dataTypes.genericows.sibs.com.ar}HeaderResp"/>
 *         &lt;element name="seleccion_con_prioridad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaResp", propOrder = {
    "cobClienteNomb",
    "count",
    "fields",
    "header",
    "seleccionConPrioridad"
})
public class ConsultaResp {

    @XmlElement(name = "cob_cliente_nomb", required = true, nillable = true)
    protected String cobClienteNomb;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer count;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns1ArrayFieldsQuerie fields;
    @XmlElement(required = true, nillable = true)
    protected HeaderResp header;
    @XmlElement(name = "seleccion_con_prioridad", required = true, type = Integer.class, nillable = true)
    protected Integer seleccionConPrioridad;

    /**
     * Gets the value of the cobClienteNomb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobClienteNomb() {
        return cobClienteNomb;
    }

    /**
     * Sets the value of the cobClienteNomb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobClienteNomb(String value) {
        this.cobClienteNomb = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns1ArrayFieldsQuerie }
     *     
     */
    public ArrayOfTns1ArrayFieldsQuerie getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns1ArrayFieldsQuerie }
     *     
     */
    public void setFields(ArrayOfTns1ArrayFieldsQuerie value) {
        this.fields = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResp }
     *     
     */
    public HeaderResp getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResp }
     *     
     */
    public void setHeader(HeaderResp value) {
        this.header = value;
    }

    /**
     * Gets the value of the seleccionConPrioridad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeleccionConPrioridad() {
        return seleccionConPrioridad;
    }

    /**
     * Sets the value of the seleccionConPrioridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeleccionConPrioridad(Integer value) {
        this.seleccionConPrioridad = value;
    }

}
