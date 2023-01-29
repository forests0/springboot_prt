package com.bssm.study.study.domain.member.service;


import com.bssm.study.study.database.entity.Member;
import com.bssm.study.study.domain.execption.CannotFindMemberException;
import com.bssm.study.study.domain.member.controller.rq.CreateMemberRq;
import com.bssm.study.study.domain.member.repository.MemberRepository;
import com.bssm.study.study.domain.member.rs.FindMemberByIdRs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public void createMember(CreateMemberRq rq) {
        Member member = Member.createNormal(
                rq.getName(),
                rq.getEmail(),
                rq.getPhone()
        );
        memberRepository.save(member);
    }
    public FindMemberByIdRs findMemberById(Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(CannotFindMemberException::new);
       return FindMemberByIdRs.create(member);
    }

    public FindMemberByIdRs findMemberByEmail(String email) {
        Member member = memberRepository.findByEmailContains(email)
                .orElseThrow(CannotFindMemberException::new);
        return FindMemberByIdRs.create(member);
    }
}
