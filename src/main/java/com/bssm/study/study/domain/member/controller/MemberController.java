package com.bssm.study.study.domain.member.controller;

import com.bssm.study.study.domain.member.controller.rq.CreateMemberRq;
import com.bssm.study.study.domain.member.rs.FindMemberByIdRs;
import com.bssm.study.study.domain.member.service.MemberService;
import com.bssm.study.study.domain.path.ApiPath;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping(ApiPath.MEMBER)
    public void CreateMember(@Validated @RequestBody CreateMemberRq rq) {
        memberService.createMember(rq);
    }

    @GetMapping(ApiPath.MEMBER_ID)
    public FindMemberByIdRs findMemberById(@PathVariable("member-id") Long memberId){
        return memberService.findMemberById(memberId);
    }

    @GetMapping(ApiPath.MEMBER_EMAIL)
    public FindMemberByIdRs findMemberByEmail(@PathVariable("member-email")String email){
        return memberService.findMemberByEmail(email);
    }
}
