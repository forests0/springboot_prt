package com.bssm.study.study.domain.member.rs;

import com.bssm.study.study.database.entity.Member;
import com.bssm.study.study.database.enums.MemberRoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FindMemberByIdRs {
    private String name;
    private String email;
    private String phone;
    private MemberRoleType memberRoleType;

    public static FindMemberByIdRs create(Member member) {
        FindMemberByIdRs rs = new FindMemberByIdRs();
        rs.name = member.getName();
        rs.email = member.getEmail();
        rs.phone = member.getPhone();
        rs.memberRoleType = member.getMemberRoleType();

        return rs;
    }
}
