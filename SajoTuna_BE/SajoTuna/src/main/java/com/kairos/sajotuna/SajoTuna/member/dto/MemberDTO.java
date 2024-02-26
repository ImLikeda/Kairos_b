package com.kairos.sajotuna.SajoTuna.member.dto;

import com.kairos.sajotuna.SajoTuna.member.Entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDTO {
    private String userId;
    private String name;
    private String password;
    private String password_check;
    private int studentId;
    private int authority;

    public MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setUserId(memberEntity.getUserId());
        memberDTO.setPassword(memberEntity.getPassword());
        memberDTO.setName(memberEntity.getName());
        memberDTO.setStudentId(memberEntity.getStudentId());
        memberDTO.setStudentId(memberEntity.getAuthority());
        return memberDTO;
    }
}
