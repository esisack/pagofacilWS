
package ar.com.sibs.genericows.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayFieldsQuerie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayFieldsQuerie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cob_cod_barra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cob_prior_gpo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cob_prior_nro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cob_texto_fe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cob_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cob_cobro_tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cob_comp_imp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero_de_orden" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayFieldsQuerie", propOrder = {
    "cobCodBarra",
    "cobPriorGpo",
    "cobPriorNro",
    "cobTextoFe",
    "cobEstado",
    "cobCobroTipo",
    "cobCompImp",
    "numeroDeOrden"
})
public class ArrayFieldsQuerie {

    @XmlElement(name = "cob_cod_barra", required = true, nillable = true)
    protected String cobCodBarra;
    @XmlElement(name = "cob_prior_gpo", required = true, nillable = true)
    protected String cobPriorGpo;
    @XmlElement(name = "cob_prior_nro", required = true, nillable = true)
    protected String cobPriorNro;
    @XmlElement(name = "cob_texto_fe", required = true, nillable = true)
    protected String cobTextoFe;
    @XmlElement(name = "cob_estado", required = true, nillable = true)
    protected String cobEstado;
    @XmlElement(name = "cob_cobro_tipo", required = true, nillable = true)
    protected String cobCobroTipo;
    @XmlElement(name = "cob_comp_imp", required = true, type = Integer.class, nillable = true)
    protected Integer cobCompImp;
    @XmlElement(name = "numero_de_orden", required = true, type = Integer.class, nillable = true)
    protected Integer numeroDeOrden;

    /**
     * Gets the value of the cobCodBarra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobCodBarra() {
        return cobCodBarra;
    }

    /**
     * Sets the value of the cobCodBarra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobCodBarra(String value) {
        this.cobCodBarra = value;
    }

    /**
     * Gets the value of the cobPriorGpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobPriorGpo() {
        return cobPriorGpo;
    }

    /**
     * Sets the value of the cobPriorGpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobPriorGpo(String value) {
        this.cobPriorGpo = value;
    }

    /**
     * Gets the value of the cobPriorNro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobPriorNro() {
        return cobPriorNro;
    }

    /**
     * Sets the value of the cobPriorNro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobPriorNro(String value) {
        this.cobPriorNro = value;
    }

    /**
     * Gets the value of the cobTextoFe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobTextoFe() {
        return cobTextoFe;
    }

    /**
     * Sets the value of the cobTextoFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobTextoFe(String value) {
        this.cobTextoFe = value;
    }

    /**
     * Gets the value of the cobEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobEstado() {
        return cobEstado;
    }

    /**
     * Sets the value of the cobEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobEstado(String value) {
        this.cobEstado = value;
    }

    /**
     * Gets the value of the cobCobroTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobCobroTipo() {
        return cobCobroTipo;
    }

    /**
     * Sets the value of the cobCobroTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobCobroTipo(String value) {
        this.cobCobroTipo = value;
    }

    /**
     * Gets the value of the cobCompImp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCobCompImp() {
        return cobCompImp;
    }

    /**
     * Sets the value of the cobCompImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCobCompImp(Integer value) {
        this.cobCompImp = value;
    }

    /**
     * Gets the value of the numeroDeOrden property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroDeOrden() {
        return numeroDeOrden;
    }

    /**
     * Sets the value of the numeroDeOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroDeOrden(Integer value) {
        this.numeroDeOrden = value;
    }

}
