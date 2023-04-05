package kr.letech.study.springBoot.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.letech.study.springBoot.test.service.TestService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {
	private final TestService testService;

	@GetMapping("/api/v1/test/now")
	public ResponseEntity<?> now() {
		String now = this.testService.selectNow();
		return ResponseEntity.ok(now);
	}

}
