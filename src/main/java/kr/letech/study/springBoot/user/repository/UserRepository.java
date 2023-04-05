package kr.letech.study.springBoot.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.letech.study.springBoot.user.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	List<Users> findFirst2ByUsernameLikeOrderByIDDesc(String name);
}
