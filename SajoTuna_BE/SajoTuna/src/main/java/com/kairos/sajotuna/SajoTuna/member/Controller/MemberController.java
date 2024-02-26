package com.kairos.sajotuna.SajoTuna.member.Controller;

import com.kairos.sajotuna.SajoTuna.member.dto.MemberDTO;
import com.kairos.sajotuna.SajoTuna.member.service.MemberService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/save")
    public String saveForm() {
        return "saveForm";
    }

    @PostMapping("/save")
    public void save(@RequestBody MemberDTO memberDTO, HttpServletResponse response) {
        memberService.save(memberDTO);

    }
}