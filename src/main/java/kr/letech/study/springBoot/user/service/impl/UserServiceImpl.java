package kr.letech.study.springBoot.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.letech.study.springBoot.user.entity.Users;
import kr.letech.study.springBoot.user.repository.UserRepository;
import kr.letech.study.springBoot.user.service.UserService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	@Override
	public List<Users> selectUserList() {
		return this.userRepository.findAll();
	}

	@Override
	public Users selectUser(Long ID) {
		return this.userRepository.findById(ID).get();
	}

	@Override
	public Users saveUser(Users users) {
		return this.userRepository.save(users);
	}

	@Override
	public void deleteUser(Long ID) {
		this.userRepository.deleteById(ID);
	}

}
