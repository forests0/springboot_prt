package com.bssm.study.study.domain.member.repository;


import com.bssm.study.study.database.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static com.bssm.study.study.database.entity.QMember.member;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Member searchByEmail(String email) {
        jpaQueryFactory
                .select(member)
                .from(member)
                .where(member.email.contains(email))
                .fetch();


        return null;
    }
}
