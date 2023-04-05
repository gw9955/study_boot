package kr.letech.study.springBoot.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.letech.study.springBoot.bbs.entity.Bbs;

//@RepositoryRestResource(path = "bbs")
public interface BbsRepository extends JpaRepository<Bbs, Long> {

}
