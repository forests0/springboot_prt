package com.bssm.study.study.domain.execption;

import org.springframework.http.HttpStatus;

public class CannotFindMemberException extends GeneralException {
    public CannotFindMemberException() {
        super(HttpStatus.BAD_REQUEST, "멤버를 찾을 수 없습니다.");
    }
}
