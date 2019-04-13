package com.son.mvcboard.tutorial.domain;

import java.util.Date;

public class MemberVO {
    private String userid; // 회원아이디
    private String userpw; // 회원 비밀번호
    private String username; // 회원이름
    private String email; // 이메일
    private Date regdate; // 가입일자
    private Date updatedate; // 수정일자

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}
