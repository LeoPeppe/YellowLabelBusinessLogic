package it.cle.project.service;

import it.cle.project.model.User;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Interfaccia IndiceADLService.
 *
 * @author dfronza
 */
public interface UserService {
	
	/**
	 * Calcola l' indice di ADL.
	 *
	 * @param indiceADL the indice adl
	 * @return the integer
	 */
//	public Integer calcolaIndiceADL(IndiceADL indiceADL);
	
	/**
	 * Codifica l'indice ADL in base al punteggio.
	 *
	 * @param adl the adl
	 * @return the string
	 */
//	public String codificaADL(Integer adl);
	
	/**
	 * inserisce i valori per il calcolo dell' indice di ADL.
	 *
	 * @param indiceADL the indice adl
	 */
	public void insert(User user);
	
	/**
	 * Recupera i valori per il calcolo dell'indice di ADL.
	 *
	 * @param idIndiceADL the id indice adl
	 * @return the indice adl
	 */
	public User selectById(Long idUser);
	
	public List<User> selectAllUsers();
	
	public int count() ;
	
	public User selectByEmail(String email);
	
	
	public String userRegistered(String email,String password);
}
