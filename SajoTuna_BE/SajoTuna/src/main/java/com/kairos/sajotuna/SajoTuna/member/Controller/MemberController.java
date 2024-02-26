package com.kairos.sajotuna.SajoTuna.member.Controller;

import com.kairos.sajotuna.SajoTuna.member.dto.MemberDTO;
import com.kairos.sajotuna.SajoTuna.member.service.MemberService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody MemberDTO memberDTO, HttpServletResponse response) {
        if (memberService.isExistStudent_Id(memberDTO)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"data\": \"이미 존재하는 아이디입니다.\"}");
        }
        if (memberService.isExistStudent_Id(memberDTO)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"data\": \"이미 존재하는 아이디입니다.\"}");
        }
        if (!memberService.isMatch(memberDTO)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"data\": \"비밀번호가 다릅니다.\"}");
        }
        try{
            memberService.save(memberDTO);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"data\": \"회원가입에 실패하였습니다.\"}");
        }
    }
}
