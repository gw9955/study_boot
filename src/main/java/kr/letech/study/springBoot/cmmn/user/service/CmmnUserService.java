package kr.letech.study.springBoot.cmmn.user.service;

import java.util.List;

import kr.letech.study.springBoot.cmmn.user.vo.SearchUserVO;
import kr.letech.study.springBoot.cmmn.user.vo.UserVO;

public interface CmmnUserService {
	// 사용자 목록
	List<UserVO> selectUserList(SearchUserVO searchVO);

	// 사용자 상세
	UserVO selectUserDetail(String userId);

	// 첨부파일 다운
	//	FileVO selectUserFile(FileVO fileVO);

	// 사용자 첨부파일
	//	List<FileVO> selectUserFileList(String userId);

	// 사용자 등록
	int insertUser(UserVO userVO);

	// 첨부파일 등록
	//	int insertUpload(FileVO fileVO);

	// 사용자 수정
	int updateUser(UserVO userVO);

	// 사용자 삭제
	int deleteUser(UserVO userVO);
}
