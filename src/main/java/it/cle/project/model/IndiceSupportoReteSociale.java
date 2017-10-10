package it.cle.project.model;

import it.cle.project.validator.annotation.ValidateIntegerSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * Questa classe indica il grado di autosufficienza e interazione con la sua Rete Sociale .
 *
 * @author Germano
 * @version 1.0
 */




@Entity
@Table(name = "indice_supporto_rete_sociale")
@XmlRootElement(name="indiceSupportoReteSociale")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndiceSupportoReteSociale {
	
	
	/** The id indice supporto rete sociale. */
	private Integer idIndiceSupportoReteSociale;
	
	
	/**   Punteggio per preparazione dei pasti. */
	private Integer preparazionePasti;
	
	/**   Punteggio per pulizia della casa. */
	private Integer puliziaCasa;
	
	/**   Punteggio per lavanderia. */
	private Integer lavanderia;
	
	/**   Punteggio per effettuazione degli acquisti. */
	private Integer effettuazioneAcquisti;
	
	/**   Punteggio per alimentazione. */
	private Integer alimentazione;
	
	/**   Punteggio per bagno. */
	private Integer bagno;
	
	/**   Punteggio per toeletta personale. */
	private Integer toelettaPersonale;
	
	/**   Punteggio per abbigliamento. */
	private Integer abbigliamento;
	
	/**   Punteggio per uso del WC. */
	private Integer usoWC;
	
	/**   Punteggio per assunzione dei medicinali. */
	private Integer assunzioneMedicinali;
	
	/**   Punteggio per trasferimenti. */
	private Integer trasferimenti;
	
	/**   Punteggio per deambulazione. */
	private Integer deambulazione;
	
	/**   Punteggio per deambulazione. */
	private Integer sostegnoPsicoAffettivo;
	
	/**   Punteggio per gestione del denaro. */
	private Integer gestioneDenaro;
	
	/**   Punteggio per supervisione diurna. */
	private Integer supervisioneDiurna;
	
	/**   Punteggio per supervisione notturna. */
	private Integer supervisioneNotturna;
	
	/** The valore supporto rete sociale. */
	private Integer valoreSupportoReteSociale;

	/**
	 * Gets the id indice supporto rete sociale.
	 *
	 * @return the id indice supporto rete sociale
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	public Integer getIdIndiceSupportoReteSociale() {
		return idIndiceSupportoReteSociale;
	}

	/**
	 * Sets the id indice supporto rete sociale.
	 *
	 * @param idIndiceSupportoReteSociale the new id indice supporto rete sociale
	 */
	public void setIdIndiceSupportoReteSociale(Integer idIndiceSupportoReteSociale) {
		this.idIndiceSupportoReteSociale = idIndiceSupportoReteSociale;
	}

	/**
	 * Gets the preparazione pasti.
	 *
	 * @return the preparazione pasti
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "preparazione_pasti")
	public Integer getPreparazionePasti() {
		return preparazionePasti;
	}

	/**
	 * Sets the preparazione pasti.
	 *
	 * @param preparazionePasti the new preparazione pasti
	 */
	public void setPreparazionePasti(Integer preparazionePasti) {
		this.preparazionePasti = preparazionePasti;
	}

	/**
	 * Gets the pulizia casa.
	 *
	 * @return the pulizia casa
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "pulizia_casa")
	public Integer getPuliziaCasa() {
		return puliziaCasa;
	}

	/**
	 * Sets the pulizia casa.
	 *
	 * @param puliziaCasa the new pulizia casa
	 */
	public void setPuliziaCasa(Integer puliziaCasa) {
		this.puliziaCasa = puliziaCasa;
	}

	/**
	 * Gets the lavanderia.
	 *
	 * @return the lavanderia
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "lavanderia")
	public Integer getLavanderia() {
		return lavanderia;
	}

	/**
	 * Sets the lavanderia.
	 *
	 * @param lavanderia the new lavanderia
	 */
	public void setLavanderia(Integer lavanderia) {
		this.lavanderia = lavanderia;
	}

	/**
	 * Gets the effettuazione acquisti.
	 *
	 * @return the effettuazione acquisti
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "effettuazione_acquisti")
	public Integer getEffettuazioneAcquisti() {
		return effettuazioneAcquisti;
	}

	/**
	 * Sets the effettuazione acquisti.
	 *
	 * @param effettuazioneAcquisti the new effettuazione acquisti
	 */
	public void setEffettuazioneAcquisti(Integer effettuazioneAcquisti) {
		this.effettuazioneAcquisti = effettuazioneAcquisti;
	}

	/**
	 * Gets the alimentazione.
	 *
	 * @return the alimentazione
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10,20 })
	@Column(name = "alimentazione")
	public Integer getAlimentazione() {
		return alimentazione;
	}

	/**
	 * Sets the alimentazione.
	 *
	 * @param alimentazione the new alimentazione
	 */
	public void setAlimentazione(Integer alimentazione) {
		this.alimentazione = alimentazione;
	}

	/**
	 * Gets the bagno.
	 *
	 * @return the bagno
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "bagno")
	public Integer getBagno() {
		return bagno;
	}

	/**
	 * Sets the bagno.
	 *
	 * @param bagno the new bagno
	 */
	public void setBagno(Integer bagno) {
		this.bagno = bagno;
	}

	/**
	 * Gets the toeletta personale.
	 *
	 * @return the toeletta personale
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10,15 })
	@Column(name = "toeletta_personale")
	public Integer getToelettaPersonale() {
		return toelettaPersonale;
	}

	/**
	 * Sets the toeletta personale.
	 *
	 * @param toelettaPersonale the new toeletta personale
	 */
	public void setToelettaPersonale(Integer toelettaPersonale) {
		this.toelettaPersonale = toelettaPersonale;
	}

	/**
	 * Gets the abbigliamento.
	 *
	 * @return the abbigliamento
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10,15 })
	@Column(name = "abbigliamento")
	public Integer getAbbigliamento() {
		return abbigliamento;
	}

	/**
	 * Sets the abbigliamento.
	 *
	 * @param abbigliamento the new abbigliamento
	 */
	public void setAbbigliamento(Integer abbigliamento) {
		this.abbigliamento = abbigliamento;
	}

	/**
	 * Gets the uso wc.
	 *
	 * @return the uso wc
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,15,25 })
	@Column(name = "uso_wc")
	public Integer getUsoWC() {
		return usoWC;
	}

	/**
	 * Sets the uso wc.
	 *
	 * @param usoWC the new uso wc
	 */
	public void setUsoWC(Integer usoWC) {
		this.usoWC = usoWC;
	}

	/**
	 * Gets the assunzione medicinali.
	 *
	 * @return the assunzione medicinali
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "assunzione_medicinali")
	public Integer getAssunzioneMedicinali() {
		return assunzioneMedicinali;
	}

	/**
	 * Sets the assunzione medicinali.
	 *
	 * @param assunzioneMedicinali the new assunzione medicinali
	 */
	public void setAssunzioneMedicinali(Integer assunzioneMedicinali) {
		this.assunzioneMedicinali = assunzioneMedicinali;
	}

	/**
	 * Gets the trasferimenti.
	 *
	 * @return the trasferimenti
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,15,20 })
	@Column(name = "trasferimenti")
	public Integer getTrasferimenti() {
		return trasferimenti;
	}

	/**
	 * Sets the trasferimenti.
	 *
	 * @param trasferimenti the new trasferimenti
	 */
	public void setTrasferimenti(Integer trasferimenti) {
		this.trasferimenti = trasferimenti;
	}

	/**
	 * Gets the deambulazione.
	 *
	 * @return the deambulazione
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10,15 })
	@Column(name = "deambulazione")
	public Integer getDeambulazione() {
		return deambulazione;
	}

	/**
	 * Sets the deambulazione.
	 *
	 * @param deambulazione the new deambulazione
	 */
	public void setDeambulazione(Integer deambulazione) {
		this.deambulazione = deambulazione;
	}
	
	/**
	 * Gets the gestione denaro.
	 *
	 * @return the gestione denaro
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "gestione_denaro")
	public Integer getGestioneDenaro() {
		return gestioneDenaro;
	}

	/**
	 * Sets the gestione denaro.
	 *
	 * @param gestioneDenaro the new gestione denaro
	 */
	public void setGestioneDenaro(Integer gestioneDenaro) {
		this.gestioneDenaro = gestioneDenaro;
	}
	

	/**
	 * Gets the sostegno psico affettivo.
	 *
	 * @return the sostegno psico affettivo
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,10 })
	@Column(name = "sostegno_psico_affettivo")
	public Integer getSostegnoPsicoAffettivo() {
		return sostegnoPsicoAffettivo;
	}

	/**
	 * Sets the sostegno psico affettivo.
	 *
	 * @param sostegnoPsicoAffettivo the new sostegno psico affettivo
	 */
	public void setSostegnoPsicoAffettivo(Integer sostegnoPsicoAffettivo) {
		this.sostegnoPsicoAffettivo = sostegnoPsicoAffettivo;
	}

	/**
	 * Gets the supervisione diurna.
	 *
	 * @return the supervisione diurna
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,15,25 })
	@Column(name = "supervisione_diurna")
	public Integer getSupervisioneDiurna() {
		return supervisioneDiurna;
	}

	/**
	 * Sets the supervisione diurna.
	 *
	 * @param supervisioneDiurna the new supervisione diurna
	 */
	public void setSupervisioneDiurna(Integer supervisioneDiurna) {
		this.supervisioneDiurna = supervisioneDiurna;
	}

	/**
	 * Gets the supervisione notturna.
	 *
	 * @return the supervisione notturna
	 */
	@NotNull
	@ValidateIntegerSet(acceptedValues = { 0,5,15,25 })
	@Column(name = "supervisione_notturna")
	public Integer getSupervisioneNotturna() {
		return supervisioneNotturna;
	}

	/**
	 * Sets the supervisione notturna.
	 *
	 * @param supervisioneNotturna the new supervisione notturna
	 */
	public void setSupervisioneNotturna(Integer supervisioneNotturna) {
		this.supervisioneNotturna = supervisioneNotturna;
	}
	
	/**
	 * Gets the valore supporto rete sociale.
	 *
	 * @return the valore supporto rete sociale
	 */
	@Column(name = "valoreSupportoReteSociale")
	public Integer getValoreSupportoReteSociale() {
		return valoreSupportoReteSociale;
	}

	/**
	 * Sets the valore supporto rete sociale.
	 *
	 * @param valoreSupportoReteSociale the new valore supporto rete sociale
	 */
	public void setValoreSupportoReteSociale(Integer valoreSupportoReteSociale) {
		this.valoreSupportoReteSociale = valoreSupportoReteSociale;
	}

	


	
	
	

}
