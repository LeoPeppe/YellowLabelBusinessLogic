package it.cle.project.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


// TODO: Auto-generated Javadoc
/**
 * The Class ReportPrestazioniRequestDTO.
 */
@XmlRootElement(name = "filtri_prestazioni")  
public class ReportPrestazioniRequestDTO  implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The comune. */
	private String comune;
	
	/** The data_da. */
	private String data_da;
	
	/** The data_a. */
	private String data_a;
	
	/**
	 * Gets the comune.
	 *
	 * @return the comune
	 */
	public String getComune() {
		return comune;
	}
	
	/**
	 * Sets the comune.
	 *
	 * @param comune the new comune
	 */
	@XmlElement(name="comune")
	public void setComune(String comune) {
		this.comune = comune;
	}
	
	/**
	 * Gets the data_da.
	 *
	 * @return the data_da
	 */
	public String getData_da() {
		return data_da;
	}
	
	/**
	 * Sets the data_da.
	 *
	 * @param data_da the new data_da
	 */
	@XmlElement(name="data_da")
	public void setData_da(String data_da) {
		this.data_da = data_da;
	}
	
	/**
	 * Gets the data_a.
	 *
	 * @return the data_a
	 */
	public String getData_a() {
		return data_a;
	}
	
	/**
	 * Sets the data_a.
	 *
	 * @param data_a the new data_a
	 */
	@XmlElement(name="data_a")
	public void setData_a(String data_a) {
		this.data_a = data_a;
	}
	
	
	
	
	

}
