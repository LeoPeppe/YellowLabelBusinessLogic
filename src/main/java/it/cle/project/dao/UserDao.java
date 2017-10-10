package it.cle.project.dao;

import it.cle.project.model.User;

import java.util.List;

/**
 * The Interface IndiceADLDao.
 */
public interface UserDao extends Dao<User> {
	
	
	
	public List<User> selectAllUsers() ;
	
	

}
