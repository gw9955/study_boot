package kr.letech.study.springBoot.cmmn.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.letech.study.springBoot.cmmn.user.service.CmmnUserService;
import kr.letech.study.springBoot.cmmn.user.vo.SearchUserVO;
import kr.letech.study.springBoot.cmmn.user.vo.UserVO;
import kr.letech.study.springBoot.cmmn.vo.CmmnMsgVO;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CmmnUserController {
	private final CmmnUserService cmmnUserService;

	@GetMapping("/api/v1/cmmn/users")
	public List<UserVO> list(SearchUserVO searchUserVO) {
		List<UserVO> list = this.cmmnUserService.selectUserList(searchUserVO);
		return list;
	}

	@GetMapping("/api/v1/cmmn/users/{userId}")
	public UserVO detail(@PathVariable String userId) {
		UserVO userVO = this.cmmnUserService.selectUserDetail(userId);
		return userVO;
	}

	@PostMapping("/api/v1/cmmn/users")
	public CmmnMsgVO insert(@RequestBody UserVO userVO) {
		int cnt = this.cmmnUserService.insertUser(userVO);
		if (cnt != 1) {
			throw new RuntimeException("사용자 등록 실패!!!!");
		}

		CmmnMsgVO msgVO = new CmmnMsgVO();
		msgVO.setCode("200");
		msgVO.setMsg("ok");
		msgVO.setData(userVO);

		return msgVO;
	}

	@PutMapping("/api/v1/cmmn/users/{userId}")
	public CmmnMsgVO update(@PathVariable String userId, @RequestBody UserVO userVO) {
		userVO.setUserId(userId);
		int cnt = this.cmmnUserService.updateUser(userVO);
		if (cnt != 1) {
			throw new RuntimeException("사용자 수정 실패!!!!");
		}

		CmmnMsgVO msgVO = new CmmnMsgVO();
		msgVO.setCode("200");
		msgVO.setMsg("ok");
		msgVO.setData(userVO);

		return msgVO;
	}

	@DeleteMapping("/api/v1/cmmn/users/{userId}")
	public CmmnMsgVO delete(@PathVariable String userId) {
		UserVO userVO = new UserVO();
		userVO.setUserId(userId);
		// userVO 수정자ID 셋팅
		int cnt = this.cmmnUserService.deleteUser(userVO);
		if (cnt != 1) {
			throw new RuntimeException("사용자 삭제 실패!!!!");
		}

		CmmnMsgVO msgVO = new CmmnMsgVO();
		msgVO.setCode("200");
		msgVO.setMsg("ok");
		msgVO.setData(userVO);

		return msgVO;
	}

}
