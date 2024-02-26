package com.kairos.sajotuna.SajoTuna.member.Entity;


import com.kairos.sajotuna.SajoTuna.member.dto.MemberDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class MemberEntity {
    @Id
    @Column(name = "user_id",nullable = false)
    private String userId;
    @Column(name ="name",nullable = false)
    private String name;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "student_id",nullable = false)
    private int studentId;
    @Column(name = "authority")
    private int authority;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUserId(memberDTO.getUserId());
        memberEntity.setName(memberDTO.getName());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setAuthority(memberDTO.getAuthority());
        return memberEntity;
    }
}
