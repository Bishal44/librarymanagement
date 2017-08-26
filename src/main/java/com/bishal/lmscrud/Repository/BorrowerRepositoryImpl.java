package com.bishal.lmscrud.Repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bishal.lmscrud.model.Borrower;



@Repository
public class BorrowerRepositoryImpl implements BorrowerRepository {
	@Autowired
	SessionFactory sessionFactory;
	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	private Session getsession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
		
	}
	@Override
	public void saveBorrowerInfo(Borrower borrower) {
		sessionFactory.openSession();
		getsession().merge(borrower);
		
	}

	@Override
	public List<Borrower> getallBorrowerInfo() {
		return getsession().createCriteria(Borrower.class).list();
	}

	@Override
	public void deleteBorrowerInfo(int id) {
		Borrower borrower=getBorrowerInfobyId(id);
		if(borrower!=null) {
			getsession().delete(borrower);
		}
	}

	@Override
	public Borrower getBorrowerInfobyId(int id) {
		
		return (Borrower) getsession().get(Borrower.class, id);
	}
	@Override
	public Borrower getUserByunameAndpass(String uname, String pass) {
		Borrower borrower=null;
		Criteria criteria=getsession().createCriteria(Borrower.class).add(Restrictions.eq("userName", uname))
				.add(Restrictions.eq("password", pass));
		borrower=(Borrower) criteria.uniqueResult();
		return borrower;
	}

}
