package kr.letech.study.springBoot.cmmn.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class CmmnMsgVO {
	private String code;
	private String msg;
	private Object data;
}
