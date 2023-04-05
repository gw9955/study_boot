package kr.letech.study.springBoot.hello.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${msg.test}")
	private String msgTest;

	@GetMapping("/api/v1/hello")
	public ResponseEntity<?> hello(String name) {
		return ResponseEntity.ok(name + "님 안녕하세요. " + this.msgTest);
	}

	@GetMapping("/api/v1/hello2")
	public Map<String, Object> hello2() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("param1", "안녕하세요.");
		map.put("param2", 123);
		return map;
	}
}
