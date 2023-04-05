package kr.letech.study.springBoot.user.service;

import java.util.List;

import kr.letech.study.springBoot.user.entity.Users;

public interface UserService {
	public List<Users> selectUserList();
	public Users selectUser(Long ID);
	public Users saveUser(Users users);
	public void deleteUser(Long ID);
}
