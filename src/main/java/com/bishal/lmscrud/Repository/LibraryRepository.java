package com.bishal.lmscrud.Repository;

import java.util.List;

import com.bishal.lmscrud.model.Library;



public interface LibraryRepository {
public void saveBookInfo(Library library);
public List <Library>getallBookInfo(); 
public void deleteBookInfo(int id);
public Library getBookById(int id);
}
