package it.cle.project.dao.hibernate;

import it.cle.project.dao.Dao;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;


/**
 * The Class AbstractHbnDao.
 *
 * @param <T> the generic type
 */
@Service
public abstract class AbstractHbnDao<T extends Object> implements Dao<T> {
	
	/** The domain class. */
	private Class<T> domainClass;
	
	/** The session factory. */
	@Inject
	private SessionFactory sessionFactory;

	
	
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#count()
	 */
	public long count() {
		return (Long) getSession()
		.createQuery("select count(*) from " + getDomainClassName())
		.uniqueResult();
	}
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#create(java.lang.Object)
	 */
	public void create(T t) {
		Method method = ReflectionUtils.findMethod(
		getDomainClass(), "setDataCreazione",
		new Class[] { Date.class });
		if (method != null) {
			try {
			method.invoke(t, new Date());
			} catch (Exception e) { /* Ignore */ }
		}
		getSession().save(t);
	}
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#delete(java.lang.Object)
	 */
	public void delete(T t) { getSession().delete(t); }
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#deleteAll()
	 */
	public void deleteAll() {	
		getSession()
		.createQuery("delete " + getDomainClassName())
		.executeUpdate();
	}
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#deleteById(java.io.Serializable)
	 */
	public void deleteById(Serializable id) { delete(load(id)); }
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#exists(java.io.Serializable)
	 */
	public boolean exists(Serializable id) { return (get(id) != null); }
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#get(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	public T get(Serializable id) {
		return (T) getSession().get(getDomainClass(), id);
	}
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#getAll()
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return getSession()
		.createQuery("from " + getDomainClassName())
		.list();
	}
	
	/**
	 * Gets the domain class.
	 *
	 * @return the domain class
	 */
	@SuppressWarnings("unchecked")
	private Class<T> getDomainClass() {
		if (domainClass == null) {
		ParameterizedType thisType =
		(ParameterizedType) getClass().getGenericSuperclass();
		this.domainClass =
		(Class<T>) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}
	
	/**
	 * Gets the domain class name.
	 *
	 * @return the domain class name
	 */
	private String getDomainClassName() {
		return getDomainClass().getName();
	}
	
	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#load(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	public T load(Serializable id) {
		return (T) getSession().load(getDomainClass(), id);
	}
	
	/* (non-Javadoc)
	 * @see it.cle.project.dao.Dao#update(java.lang.Object)
	 */
	public void update(T t) { getSession().update(t); }
}
