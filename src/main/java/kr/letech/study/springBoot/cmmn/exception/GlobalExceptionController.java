package kr.letech.study.springBoot.cmmn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import kr.letech.study.springBoot.cmmn.vo.CmmnMsgVO;
import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionController {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public CmmnMsgVO exception(Exception e) {
		log.error(e.getMessage(), e);
		CmmnMsgVO msgVO = new CmmnMsgVO();
		msgVO.setCode("500");
		msgVO.setMsg("오류가 발생하였습니다.");
		return msgVO;
	}
}
