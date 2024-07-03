package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public int save(User user) {
		System.out.println("inside service");
		return userDao.save(user);
	}
}
