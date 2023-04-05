package kr.letech.study.springBoot.cmmn.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.letech.study.springBoot.cmmn.user.dao.CmmnUserDAO;
import kr.letech.study.springBoot.cmmn.user.service.CmmnUserService;
import kr.letech.study.springBoot.cmmn.user.vo.SearchUserVO;
import kr.letech.study.springBoot.cmmn.user.vo.UserVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CmmnUserServiceImpl implements CmmnUserService {
	private final CmmnUserDAO cmmnUserDAO;

	@Override
	public List<UserVO> selectUserList(SearchUserVO searchVO) {
		return this.cmmnUserDAO.selectUserList(searchVO);
	}

	@Override
	public UserVO selectUserDetail(String userId) {
		return this.cmmnUserDAO.selectUserDetail(userId);
	}

	@Override
	public int insertUser(UserVO userVO) {
		return this.cmmnUserDAO.insertUser(userVO);
	}

	@Override
	public int updateUser(UserVO userVO) {
		String userPw = userVO.getUserPw();
		userVO.setUserPw(userPw);
		return this.cmmnUserDAO.updateUser(userVO);
	}

	@Override
	public int deleteUser(UserVO userVO) {
		return this.cmmnUserDAO.deleteUser(userVO);
	}


}
