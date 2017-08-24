package com.bishal.lmscrud.Repository;

import java.util.List;


import com.bishal.lmscrud.model.User;

public interface UserRepository {
	public void saveUserInfo(User user);
	public List <User>getallUserInfo(); 
	public void deleteUserInfo(int id);
	public User getUserInfobyId(int id);
	public User getUserByunameAndpass(String uname,String pass);
}
