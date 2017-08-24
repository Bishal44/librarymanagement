package com.bishal.lmscrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bishal.lmscrud.Repository.UserRepository;
import com.bishal.lmscrud.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userrepository;
	@Override
	public void saveUserInfo(User user) {
		userrepository.saveUserInfo(user);
		
	}

	@Override
	public List<User> getallUserInfo() {
	
		return userrepository.getallUserInfo();
	}

	@Override
	public void deleteUserInfo(int id) {
		userrepository.deleteUserInfo(id);
		
	}

	@Override
	public User getUserInfobyId(int id) {
		
		return userrepository.getUserInfobyId(id);
	}

	@Override
	public User getUserByunameAndpass(String uname, String pass) {
		
		return userrepository.getUserByunameAndpass(uname, pass);
	}

}
