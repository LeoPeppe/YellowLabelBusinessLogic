package it.cle.project.dto;


import it.cle.project.utils.Utils;

import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;


// TODO: Auto-generated Javadoc
/**
 * The Class ReportPrestazioniDTO.
 */
@XmlRootElement(name = "costo_prestazioni") 
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportPrestazioniDTO  implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6382772159122404320L;

	
	/** The logger. */
	protected Logger logger = Logger.getLogger(ReportPrestazioniDTO.class);
	
	
	
	/** The prestazione. */
	@XmlElement(name = "prestazione")
	private String prestazione;
	
	/** The num_prestazioni. */
	@XmlElement(name = "num_prestazioni")
	private Integer num_prestazioni;
	
	/** The costo_unitario. */
	@XmlElement(name = "costo_unitario")
	private Double costo_unitario;
	
	/** The importo_prestazioni. */
	@XmlElement(name = "importo_prestazioni")
	private Double importo_prestazioni;
	
	
	/**
	 * Gets the prestazione.
	 *
	 * @return the prestazione
	 */
	public String getPrestazione() {
		try {
			return URLDecoder.decode(prestazione, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
//			e.printStackTrace();
			logger.error("Errore nella decodifica UTF-8 della prestazione " + this.prestazione);
			logger.error(Utils.getStackTrace(e));
			return prestazione;
		}
	}
	
	/**
	 * Sets the prestazione.
	 *
	 * @param prestazione the new prestazione
	 */
	public void setPrestazione(String prestazione) {
		try {
			this.prestazione = URLEncoder.encode(prestazione, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			logger.error("Errore nella codifica UTF-8 della prestazione " + prestazione);
			logger.error(Utils.getStackTrace(e));
			this.prestazione = prestazione;
		} 
		
		
	}
	
	/**
	 * Gets the num_prestazioni.
	 *
	 * @return the num_prestazioni
	 */
	public Integer getNum_prestazioni() {
		return num_prestazioni;
	}
	
	/**
	 * Sets the num_prestazioni.
	 *
	 * @param num_prestazioni the new num_prestazioni
	 */
	public void setNum_prestazioni(Integer num_prestazioni) {
		this.num_prestazioni = num_prestazioni;
	}
	
	/**
	 * Gets the costo_unitario.
	 *
	 * @return the costo_unitario
	 */
	public Double getCosto_unitario() {
		return costo_unitario;
	}
	
	/**
	 * Sets the costo_unitario.
	 *
	 * @param costo_unitario the new costo_unitario
	 */
	public void setCosto_unitario(Double costo_unitario) {
		this.costo_unitario = costo_unitario;
	}
	
	/**
	 * Gets the importo_prestazioni.
	 *
	 * @return the importo_prestazioni
	 */
	public Double getImporto_prestazioni() {
		return importo_prestazioni;
	}
	
	
	/**
	 * Sets the importo_prestazioni.
	 *
	 * @param importo_prestazioni the new importo_prestazioni
	 */
	public void setImporto_prestazioni(Double importo_prestazioni) {
		this.importo_prestazioni = importo_prestazioni;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReportPrestazioniDTO [prestazione=" + prestazione + ", num_prestazioni=" + num_prestazioni
				+ ", costo_unitario=" + costo_unitario + ", importo_prestazioni=" + importo_prestazioni + "]";
	}

	
	/**
	 * To string xml.
	 *
	 * @return the string
	 */
	public String toStringXML() {
		
		StringWriter out = new StringWriter();
		
		try {
		JAXBContext jc = JAXBContext.newInstance(ReportPrestazioniDTO.class);
		Marshaller marsh = jc.createMarshaller();
		
		marsh.marshal(this, out);
		
		} catch(Exception e) {
			
			logger.error(Utils.getStackTrace(e));
			
		}
		return out.toString();
	}
	

}
