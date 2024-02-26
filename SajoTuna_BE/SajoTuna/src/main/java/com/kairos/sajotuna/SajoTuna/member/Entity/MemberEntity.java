package com.kairos.sajotuna.SajoTuna.member.Entity;


import com.kairos.sajotuna.SajoTuna.member.dto.MemberDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class MemberEntity {
    @Id
    @Column(name = "user_id",nullable = false, length = 20)
    private String user_id;
    @Column(name = "name",nullable = false,length = 20)
    private String name;
    @Column(name = "password",nullable = false,length = 255)
    private  String password;
    @Column(name = "student_id",nullable = false)
    private int student_id;
    @Column(name = "authority",nullable = false)
    private int authority;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUser_id(memberDTO.getUser_id());
        memberEntity.setName(memberDTO.getName());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setStudent_id(memberEntity.getStudent_id());
        memberEntity.setAuthority(memberEntity.getAuthority());
        return memberEntity;
    }

}
