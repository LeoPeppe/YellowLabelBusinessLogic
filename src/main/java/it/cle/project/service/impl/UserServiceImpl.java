package it.cle.project.service.impl;


import java.util.List;

import it.cle.project.dao.hbn.HbnUserDao;
import it.cle.project.model.User;
import it.cle.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * The Class IndiceADLServiceImpl.
 * Questa classe implementa contiene la Business Logic e 
 * i metodi per le operazioni base relative all' indice ADL
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	/** The dao. */
	@Autowired
	private HbnUserDao userDao;

	@Override
	public void insert(User user) {
		userDao.create(user);
	}

	@Override
	public User selectById(Long idUser) {
		
		return userDao.get(idUser);
	}

	@Override
	public List<User> selectAllUsers() {
		return userDao.selectAllUsers();
	}

	@Override
	public int count() {
		
		return (int) userDao.count();
	}

	@Override
	public User selectByEmail(String email) {
		
		return userDao.selectByEmail(email);
	}

	@Override
	public String userRegistered(String email,String password) {
		return userDao.userRegistered(email,password);
	}
}
