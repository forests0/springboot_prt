package com.bssm.study.study.domain.member.repository;

import com.bssm.study.study.database.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    Optional<Member> findByEmail(String email);
    Optional<Member> findByEmailLikes(String email);
    Optional<Member> findByEmailContains(String email);
}
