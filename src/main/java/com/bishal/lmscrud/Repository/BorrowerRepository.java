package com.bishal.lmscrud.Repository;

import java.util.List;

import com.bishal.lmscrud.model.Borrower;




public interface BorrowerRepository {
	public void saveBorrowerInfo(Borrower borrower);
	public List <Borrower>getallBorrowerInfo(); 
	public void deleteBorrowerInfo(int id);
	public Borrower getBorrowerInfobyId(int id);
	public Borrower getUserByunameAndpass(String uname,String pass);
}
