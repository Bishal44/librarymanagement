package com.bishal.lmscrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bishal.lmscrud.Repository.LibraryRepository;
import com.bishal.lmscrud.model.Library;

@Service

@Transactional
public class LmsServiceImpl implements LmsService {
	   @Autowired
	LibraryRepository lmsrepository;
	@Override
	public void saveBookInfo(Library library) {
		lmsrepository.saveBookInfo(library);
	}

	@Override
	public List<Library> getallBookInfo() {
		
		return lmsrepository.getallBookInfo();
	}

	@Override
	public void deleteBookInfo(int id) {
	lmsrepository.deleteBookInfo(id);
		
	}

	@Override
	public Library getBookById(int id) {
		
		return lmsrepository.getBookById(id);
	}

}
