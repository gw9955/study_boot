package kr.letech.study.springBoot.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.letech.study.springBoot.user.entity.Users;
import kr.letech.study.springBoot.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
	private final UserService userService;

	@GetMapping("/api/v1/users")
	public ResponseEntity<?> getUsers() {
		List<Users> list = this.userService.selectUserList();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/api/v1/users/{ID}")
	public ResponseEntity<?> getUsers(@PathVariable("ID") Long ID) {
		log.info("디테일 아이디 : " + ID);
		Users users = this.userService.selectUser(ID);
		log.info("디테일 저르보 : " + users);
		return ResponseEntity.ok(users);
	}

	@PostMapping("/api/v1/users")
	public ResponseEntity<?> insertUsers(Users users) {
		Users result = this.userService.saveUser(users);
		return ResponseEntity.ok(result);
	}

	@PutMapping("/api/v1/users/{ID}")
	public ResponseEntity<?> updateUsers(@PathVariable("ID") Long ID, Users users) {
		users.setID(ID);
		Users result = this.userService.saveUser(users);
		return ResponseEntity.ok(result);
	}

	@DeleteMapping("/api/v1/users/{ID}")
	public ResponseEntity<?> deleteUsers(@PathVariable("ID") Long ID) {
		this.userService.deleteUser(ID);
		return ResponseEntity.ok(ID + " 삭제됨");
	}

}
