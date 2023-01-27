package com.bssm.study.study.database.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1525552818L;

    public static final QMember member = new QMember("member1");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.bssm.study.study.database.enums.MemberRoleType> memberRoleType = createEnum("memberRoleType", com.bssm.study.study.database.enums.MemberRoleType.class);

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final ListPath<Portfolio, QPortfolio> portfolioList = this.<Portfolio, QPortfolio>createList("portfolioList", Portfolio.class, QPortfolio.class, PathInits.DIRECT2);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

