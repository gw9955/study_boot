package kr.letech.study.springBoot.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;

	private String username;

}
