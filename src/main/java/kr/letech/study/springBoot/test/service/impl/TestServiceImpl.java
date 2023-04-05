package kr.letech.study.springBoot.test.service.impl;

import org.springframework.stereotype.Service;

import kr.letech.study.springBoot.test.dao.TestDAO;
import kr.letech.study.springBoot.test.service.TestService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
	private final TestDAO testDAO;

	@Override
	public String selectNow() {
		return this.testDAO.selectNow();
	}

}
