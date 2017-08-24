package com.bishal.lmscrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bishal.lmscrud.Repository.BorrowerRepository;
import com.bishal.lmscrud.model.Borrower;

@Service
@Transactional
public class BorrowerServiceImpl implements BorrowerService {
@Autowired
BorrowerRepository borrowerrepository;

	@Override
	public void saveBorrowerInfo(Borrower borrower) {
		borrowerrepository.saveBorrowerInfo(borrower);
		
	}

	@Override
	public List<Borrower> getallBorrowerInfo() {
		
		return borrowerrepository.getallBorrowerInfo();
	}

	@Override
	public void deleteBorrowerInfo(int id) {
	borrowerrepository.deleteBorrowerInfo(id);
		
	}

	@Override
	public Borrower getBorrowerInfobyId(int id) {
		
		return borrowerrepository.getBorrowerInfobyId(id);
	}

	@Override
	public Borrower getUserByunameAndpass(String uname, String pass) {
		
		return borrowerrepository.getUserByunameAndpass(uname, pass);
	}

}
