package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.*;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user)
	{
		System.out.println("Enter here1");
		return this.userDao.saveUser(user);
	}
	
	public List<User> getalluser()
	{
		return this.userDao.getAllUser();
	}

}
