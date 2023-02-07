package com.bssm.study.study.domain.member.repository;

import com.bssm.study.study.database.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepositoryCustom  {
    Member searchByEmail(String email);

}
