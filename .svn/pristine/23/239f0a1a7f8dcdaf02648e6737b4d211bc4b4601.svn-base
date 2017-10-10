package it.cle.project.service.impl;

import it.cle.project.dao.hbn.HbnIndiceSupportoReteSocialeDao;
import it.cle.project.model.IndiceSupportoReteSociale;
import it.cle.project.service.IndiceSupportoReteSocialeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * The Class IndiceSupportoReteSocialeServiceImpl.
 * Questa classe implementa i metodi per le operazioni base relative all' indice Supporto della Rete Sociale
 */
@Service("indiceSupportoReteSocialeService")
@Transactional
public class IndiceSupportoReteSocialeServiceImpl implements IndiceSupportoReteSocialeService {
	
	/** The Constant vsoc1. */
	private static final String vsoc1="Ben assistito";
	
	/** The Constant vsoc2. */
	private static final String vsoc2="Parzialmente assistito";
	
	/** The Constant vsoc3. */
	private static final String vsoc3="Non sufficientemente assistito";
	
	/** The dao. */
	@Autowired
	private HbnIndiceSupportoReteSocialeDao dao;

	/* (non-Javadoc)
	 * @see it.cle.project.service.IndiceSupportoReteSocialeService#calcolaIndiceSupportoReteSociale(it.cle.project.model.IndiceSupportoReteSociale)
	 */
	@Override
	public Integer calcolaIndiceSupportoReteSociale(IndiceSupportoReteSociale indiceSupportoReteSociale) {
		
		Integer punteggioSupportoReteSociale = indiceSupportoReteSociale.getAbbigliamento()+
				indiceSupportoReteSociale.getAlimentazione()+
				indiceSupportoReteSociale.getAssunzioneMedicinali()+
				indiceSupportoReteSociale.getBagno()+
				indiceSupportoReteSociale.getDeambulazione()+
				indiceSupportoReteSociale.getEffettuazioneAcquisti()+
				indiceSupportoReteSociale.getGestioneDenaro()+
				indiceSupportoReteSociale.getLavanderia()+
				indiceSupportoReteSociale.getPreparazionePasti()+
				indiceSupportoReteSociale.getPuliziaCasa()+
				indiceSupportoReteSociale.getSostegnoPsicoAffettivo()+
				indiceSupportoReteSociale.getSupervisioneDiurna()+
				indiceSupportoReteSociale.getSupervisioneNotturna()+
				indiceSupportoReteSociale.getToelettaPersonale()+
				indiceSupportoReteSociale.getTrasferimenti()+
				indiceSupportoReteSociale.getUsoWC();
		
		return punteggioSupportoReteSociale;
	}

	/* (non-Javadoc)
	 * @see it.cle.project.service.IndiceSupportoReteSocialeService#insert(it.cle.project.model.IndiceSupportoReteSociale)
	 */
	@Override
	public void insert(IndiceSupportoReteSociale indiceSupportoReteSociale) {
		dao.create(indiceSupportoReteSociale);
		
	}

	/* (non-Javadoc)
	 * @see it.cle.project.service.IndiceSupportoReteSocialeService#selectById(java.lang.Integer)
	 */
	@Override
	public IndiceSupportoReteSociale selectById(
			Integer idIndiceSupportoReteSociale) {
		return dao.get(idIndiceSupportoReteSociale);
		
	}

	/* (non-Javadoc)
	 * @see it.cle.project.service.IndiceSupportoReteSocialeService#codificaPsoc(java.lang.Integer)
	 */
	@Override
	public String codificaPsoc(Integer vsoc) {
		String vsocCodificato = null;
		
		if(vsoc>=0 && vsoc<=80 ){
			vsocCodificato = vsoc1;
		}
		if(vsoc>=85 && vsoc<=160){
			vsocCodificato = vsoc2;
		}
		if(vsoc>=165 && vsoc<=240){
			vsocCodificato = vsoc3;
		}
		
		return vsocCodificato;
	}
	
	
	
}
