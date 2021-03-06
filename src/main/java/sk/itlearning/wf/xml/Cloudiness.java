//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 11:45:51 PM CET 
//


package sk.itlearning.wf.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Element denoting the cloudiness in percent or eights.
 * 			
 * 
 * <p>Java class for cloudiness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloudiness">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="eights">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="percent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloudiness")
public class Cloudiness {

    @XmlAttribute(name = "eights")
    protected Integer eights;
    @XmlAttribute(name = "percent")
    protected String percent;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the eights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEights() {
        return eights;
    }

    /**
     * Sets the value of the eights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEights(Integer value) {
        this.eights = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
