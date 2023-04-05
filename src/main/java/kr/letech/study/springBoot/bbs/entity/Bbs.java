package kr.letech.study.springBoot.bbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Bbs {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 256)
	private String title;

	@Column(length = 2000)
	private String contents;
}
