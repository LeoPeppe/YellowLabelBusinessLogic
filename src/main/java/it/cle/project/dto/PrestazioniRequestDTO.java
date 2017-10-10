package it.cle.project.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


// TODO: Auto-generated Javadoc
/**
 * The Class PrestazioniRequestDTO.
 */
@XmlRootElement(name = "indici")  
public class PrestazioniRequestDTO  implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The range adl. */
	private String rangeADL;
	
	/** The range barthel. */
	private String rangeBarthel;
	
	/** The range rete. */
	private String rangeRete;
	
	
	
	/**
	 * Gets the range adl.
	 *
	 * @return the range adl
	 */
	public String getRangeADL() {
		return rangeADL;
	}
	
	/**
	 * Sets the range adl.
	 *
	 * @param rangeADL the new range adl
	 */
	@XmlElement(name="rangeADL")
	public void setRangeADL(String rangeADL) {
		this.rangeADL = rangeADL;
	}
	
	/**
	 * Gets the range barthel.
	 *
	 * @return the range barthel
	 */
	public String getRangeBarthel() {
		return rangeBarthel;
	}
	
	/**
	 * Sets the range barthel.
	 *
	 * @param rangeBarthel the new range barthel
	 */
	@XmlElement(name="rangeBarthel")
	public void setRangeBarthel(String rangeBarthel) {
		this.rangeBarthel = rangeBarthel;
	}
	
	/**
	 * Gets the range rete.
	 *
	 * @return the range rete
	 */
	public String getRangeRete() {
		return rangeRete;
	}
	
	/**
	 * Sets the range rete.
	 *
	 * @param rangeRete the new range rete
	 */
	@XmlElement(name="rangeRete")
	public void setRangeRete(String rangeRete) {
		this.rangeRete = rangeRete;
	}
	
	

}
