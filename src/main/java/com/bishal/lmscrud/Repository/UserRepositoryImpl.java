package com.bishal.lmscrud.Repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bishal.lmscrud.model.User;


@Repository
public class UserRepositoryImpl implements UserRepository {
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
	public User getUserByunameAndpass(String uname, String pass) {
		User user=null;
		Criteria criteria=getsession().createCriteria(User.class).add(Restrictions.eq("uname", uname))
				.add(Restrictions.eq("password", pass));
		user=(User) criteria.uniqueResult();
		return user;
	}
	@Override
	public void saveUserInfo(User user) {
		sessionFactory.openSession();
		getsession().merge(user);
		
	}
	@Override
	public List<User> getallUserInfo() {
		return getsession().createCriteria(User.class).list();
	}
	@Override
	public void deleteUserInfo(int id) {
	User user=getUserInfobyId(id);
	if(user!=null) {
		getsession().delete(user);
	}
		
	}
	@Override
	public User getUserInfobyId(int id) {
		
		return (User) getsession().get(User.class, id);
	}
	

}
