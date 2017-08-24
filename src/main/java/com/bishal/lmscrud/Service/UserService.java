package com.bishal.lmscrud.Service;

import java.util.List;

import com.bishal.lmscrud.model.User;

public interface UserService {
	public void saveUserInfo(User user);
	public List <User>getallUserInfo(); 
	public void deleteUserInfo(int id);
	public User getUserInfobyId(int id);
	public User getUserByunameAndpass(String uname,String pass);
}
