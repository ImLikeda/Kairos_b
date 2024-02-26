package com.kairos.sajotuna.SajoTuna.member.service;

import com.kairos.sajotuna.SajoTuna.member.Entity.MemberEntity;
import com.kairos.sajotuna.SajoTuna.member.Repository.MemberRepository;
import com.kairos.sajotuna.SajoTuna.member.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO){
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
    public boolean isExistUser_Id(MemberDTO memberDTO){
        return memberRepository.existsByUserId(memberDTO.getUserId());
    }
    public boolean isExistStudent_Id(MemberDTO memberDTO){
        return memberRepository.existsByStudentId(memberDTO.getStudentId());
    }
    public boolean isMatch(MemberDTO memberDTO){
        if( memberDTO.getPassword().equals(memberDTO.getPassword_check())){
            return true;
        }
        else{
            return false;
        }
    }
}
