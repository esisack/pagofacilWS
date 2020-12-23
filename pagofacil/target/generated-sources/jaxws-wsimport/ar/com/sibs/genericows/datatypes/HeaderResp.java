
package ar.com.sibs.genericows.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HeaderResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="algoritmo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codSeveridad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaHora" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nroSecuencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderResp", propOrder = {
    "algoritmo",
    "cajero",
    "codError",
    "codSeveridad",
    "fechaHora",
    "idMensaje",
    "marca",
    "nroSecuencia",
    "terminal",
    "version"
})
public class HeaderResp {

    @XmlElement(required = true, nillable = true)
    protected String algoritmo;
    @XmlElement(required = true, nillable = true)
    protected String cajero;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codError;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codSeveridad;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHora;
    @XmlElement(required = true, nillable = true)
    protected String idMensaje;
    @XmlElement(required = true, nillable = true)
    protected String marca;
    @XmlElement(required = true, nillable = true)
    protected String nroSecuencia;
    @XmlElement(required = true, nillable = true)
    protected String terminal;
    @XmlElement(required = true, nillable = true)
    protected String version;

    /**
     * Gets the value of the algoritmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgoritmo() {
        return algoritmo;
    }

    /**
     * Sets the value of the algoritmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgoritmo(String value) {
        this.algoritmo = value;
    }

    /**
     * Gets the value of the cajero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCajero() {
        return cajero;
    }

    /**
     * Sets the value of the cajero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCajero(String value) {
        this.cajero = value;
    }

    /**
     * Gets the value of the codError property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodError() {
        return codError;
    }

    /**
     * Sets the value of the codError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodError(Integer value) {
        this.codError = value;
    }

    /**
     * Gets the value of the codSeveridad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSeveridad() {
        return codSeveridad;
    }

    /**
     * Sets the value of the codSeveridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSeveridad(Integer value) {
        this.codSeveridad = value;
    }

    /**
     * Gets the value of the fechaHora property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHora() {
        return fechaHora;
    }

    /**
     * Sets the value of the fechaHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHora(XMLGregorianCalendar value) {
        this.fechaHora = value;
    }

    /**
     * Gets the value of the idMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMensaje() {
        return idMensaje;
    }

    /**
     * Sets the value of the idMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMensaje(String value) {
        this.idMensaje = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the nroSecuencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSecuencia() {
        return nroSecuencia;
    }

    /**
     * Sets the value of the nroSecuencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSecuencia(String value) {
        this.nroSecuencia = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
