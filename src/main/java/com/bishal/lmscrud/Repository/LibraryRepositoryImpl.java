package com.bishal.lmscrud.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bishal.lmscrud.model.Library;



@Repository

public class LibraryRepositoryImpl implements LibraryRepository {

	@Autowired
	SessionFactory sessionFactory;
	private SessionFactory gtSessionFactory() {
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
	public void saveBookInfo(Library library) {

		sessionFactory.openSession();
		getsession().merge(library);
		
	}

	@Override
	public List<Library> getallBookInfo() {
		
		return getsession().createCriteria(Library.class).list();
	}

	@Override
	public void deleteBookInfo(int id) {
	Library library=getBookById(id);
	if(library!=null) {
		getsession().delete(library);
	}
		
	}

	@Override
	public Library getBookById(int id) {
	
		return (Library) getsession().get(Library.class, id);
	}
	

}
