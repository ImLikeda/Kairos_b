package com.kairos.sajotuna.SajoTuna.member.Repository;


import com.kairos.sajotuna.SajoTuna.member.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity,Long> {

}
