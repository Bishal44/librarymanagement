package com.bishal.lmscrud.Service;

import java.util.List;

import com.bishal.lmscrud.model.Borrower;

public interface BorrowerService {
	public void saveBorrowerInfo(Borrower borrower);
	public List <Borrower>getallBorrowerInfo(); 
	public void deleteBorrowerInfo(int id);
	public Borrower getBorrowerInfobyId(int id);
	public Borrower getUserByunameAndpass(String uname,String pass);
}
