package com.kairos.sajotuna.SajoTuna.member.service;
import com.kairos.sajotuna.SajoTuna.member.Entity.MemberEntity;
import com.kairos.sajotuna.SajoTuna.member.Repository.MemberRepository;
import com.kairos.sajotuna.SajoTuna.member.dto.MemberDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class MemberService {
    private MemberRepository memberRepository;

    public void save(MemberDTO memberDTO){
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);

    }

}
