package kr.letech.study.springBoot.test.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDAO {
	String selectNow();
}
