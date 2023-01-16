package com.bssm.study.study.database.entity;

import com.bssm.study.study.database.enums.MemberRoleType;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String phone;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberRoleType memberRoleType;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Portfolio> portfolioList = new ArrayList<>();

    public static Member createNormal(String name, String email, String phone) {
        Member member = new Member();
        member.name = name;
        member.email = email;
        member.phone = phone;
        member.memberRoleType = MemberRoleType.NORMAL;
        return member;
    }
}
