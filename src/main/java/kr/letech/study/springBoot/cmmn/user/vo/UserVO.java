package kr.letech.study.springBoot.cmmn.user.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString(callSuper = true)
public class UserVO {
	private String userId;			// 사용자 아이디
	private String userPw;			// 사용자 비밀번호
	private String userNm;			// 사용자 이름
	private String phtFileGrpId;	// 사진 파일 그룹 ID
	private String rgstId;			// 등록자
	private String rgstDt;			// 등록일시
	private String updtId;			// 수정자
	private String updtDt;			// 수정일시
	private String delYn;			// 삭제여부
	//	private MultipartFile[] files;

	//	private List<FileVO> fileVOList;
	//
	//	public UserVO() {
	//		this.fileVOList = new ArrayList<>();
	//	}

}
