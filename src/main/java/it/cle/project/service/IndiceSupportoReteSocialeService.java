package it.cle.project.service;

import it.cle.project.model.IndiceSupportoReteSociale;

// TODO: Auto-generated Javadoc
/**
* Interfaccia IndiceSupportoReteSocialeService.
* @author Germano
*/
public interface IndiceSupportoReteSocialeService {
	
	/**
	 * Calcola la situazione prevenzione Decubiti.
	 *
	 * @param indiceSupportoReteSociale the indice supporto rete sociale
	 * @return the integer
	 */
	public Integer calcolaIndiceSupportoReteSociale(IndiceSupportoReteSociale indiceSupportoReteSociale);
	

	/**
	 * inserisce i valori per il calcolo dell' indice di Supporto Rete Sociale.
	 *
	 * @param indiceSupportoReteSociale the indice supporto rete sociale
	 */
	public void insert(IndiceSupportoReteSociale indiceSupportoReteSociale);
	
	/**
	 * Recupera i valori per il calcolo dell'indice di Supporto Rete Sociale.
	 *
	 * @param idIndiceSupportoReteSociale the id indice supporto rete sociale
	 * @return the indice supporto rete sociale
	 */
	public IndiceSupportoReteSociale selectById(
			Integer idIndiceSupportoReteSociale);
	
	/**
	 * Codifica psoc.
	 *
	 * @param vsoc the vsoc
	 * @return the string
	 */
	public String codificaPsoc(Integer vsoc);

}


