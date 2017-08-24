package com.bishal.lmscrud.Service;

import java.util.List;

import com.bishal.lmscrud.model.Library;



public interface LmsService {
	
	 void saveBookInfo(Library library);
		public List <Library>getallBookInfo(); 
		public void deleteBookInfo(int id);
		public Library getBookById(int id);
}
