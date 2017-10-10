package it.cle.project.dao;

import java.io.Serializable;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface Dao.
 * @author Fronza
 * @param <T> the generic type
 */
public interface Dao<T extends Object> {
	
	/**
	 * Torna il count.
	 *
	 * @return long
	 */
	long count();
	
	/**
	 * Crea.
	 *
	 * @param t the t
	 */
	void create(T t);
	
	/**
	 * Cancella.
	 *
	 * @param t the t
	 */
	void delete(T t);
	
	/**
	 * Cancella tutto.
	 */
	void deleteAll();
	
	/**
	 * Cancella dato l' id.
	 *
	 * @param id the id
	 */
	void deleteById(Serializable id);
	
	/**
	 * Esiste.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	boolean exists(Serializable id);
	
	/**
	 * Recupera .
	 *
	 * @param id the id
	 * @return List<T>
	 */
	T get(Serializable id);
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	List<T> getAll();
	
	/**
	 * Carica.
	 *
	 * @param id the id
	 * @return T t
	 */
	T load(Serializable id);
	
	/**
	 * Aggiorna.
	 *
	 * @param t the t
	 */
	void update(T t);
}