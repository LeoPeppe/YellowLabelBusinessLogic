package it.cle.project.dao.hbn;

import java.sql.ResultSet;
import java.util.List;

import it.cle.project.dao.UserDao;
import it.cle.project.dao.hibernate.AbstractHbnDao;
import it.cle.project.model.User;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.stereotype.Repository;

/**
 * The Class HbnIndiceADLDao.
 */
//@Component //aggiunto da me
@Repository
public class HbnUserDao extends AbstractHbnDao<User> implements UserDao {

	
public List<User> selectAllUsers() {
		
		List<User> userList = null;
		Session session = getSession();
	
		String sql = "SELECT * FROM users ";
	
		
		SQLQuery query = session.createSQLQuery(sql).addEntity(User.class);
//		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		userList = query.list();
		
//		System.out.println("Select COUNT : "+userList.size());
		
		return userList;
	}

	


@SuppressWarnings("null")
public User selectByEmail(String email) {
	List<User> userList = null;
	
	User user = new User();
	Session session = getSession();

	String sql = "SELECT * FROM users where email=\'"+email+"\'";
		
		SQLQuery query = session.createSQLQuery(sql).addEntity(User.class);
		userList = query.list();

		if(userList.size()>0){
		user= userList.get(0);
	}
	
	
	return user;
}




public String userRegistered(String email, String password) {
	String result="false";
	
	List<User> userList = null;
	Session session = getSession();

	String sql = "SELECT * FROM users where email=\'"+email+"\' AND password=\'"+password+"\'";
		
		SQLQuery query = session.createSQLQuery(sql).addEntity(User.class);
		 userList = query.list();

		if(userList.size()>0){
			result="true";
	}
	return result;
}

}
