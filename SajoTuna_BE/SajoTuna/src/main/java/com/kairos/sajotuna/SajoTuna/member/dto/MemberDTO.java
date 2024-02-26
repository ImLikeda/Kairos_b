package com.kairos.sajotuna.SajoTuna.member.dto;

import com.kairos.sajotuna.SajoTuna.member.Entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
    private String user_id;
    private String name;
    private String password;
    private int student_id;
    private int authority;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setUser_id(memberEntity.getUser_id());
        memberDTO.setName(memberEntity.getName());
        memberDTO.setPassword(memberEntity.getPassword());
        memberDTO.setStudent_id(memberEntity.getStudent_id());
        memberDTO.setAuthority(memberDTO.getAuthority());
        return memberDTO;
    }
}
