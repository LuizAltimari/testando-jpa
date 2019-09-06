package br.com.ebix.teste.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.ebix.teste.util.HibernateUtil;

public class AbstractDAO<T> {

	private Class<T> classe;

	@SuppressWarnings("unchecked")
	public AbstractDAO() {
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void save(T obj) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(obj);
			transaction.commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> selectAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria c = session.createCriteria(this.classe);
			return c.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public T select(int key) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria c = session.createCriteria(this.classe);
			c.add(Restrictions.idEq(key));
			return (T) c.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public T select(String key) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria c = session.createCriteria(this.classe);
			c.add(Restrictions.idEq(key));
			return (T) c.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
	}
	
	
	public void delete(int key) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		T obj = this.select(key);
		try {
			transaction = session.beginTransaction();
			session.delete(obj);
			transaction.commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}
	
	
	public void delete(String key) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		T obj = this.select(key);
		try {
			transaction = session.beginTransaction();
			session.delete(obj);
			transaction.commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}
	
	
	public void update(T obj) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(obj);
			transaction.commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}

}
