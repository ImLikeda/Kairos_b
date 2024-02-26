package com.kairos.sajotuna.SajoTuna.post.file.FileController;

import com.kairos.sajotuna.SajoTuna.post.file.FileDTO.FileDTO;
import com.kairos.sajotuna.SajoTuna.post.file.FileEntity.FileEntity;
import com.kairos.sajotuna.SajoTuna.post.file.FileRepository.FileRepository;
import com.kairos.sajotuna.SajoTuna.post.file.FileService.FileService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/file")
public class FileController {
    private final FileRepository fileRepository;
    private final FileService fileService;
    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody FileDTO fileDTO, HttpServletResponse response){
        try{
            fileService.saveFile(fileDTO);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"data\": \"데이터가 삽입 실패.\"}");
        }
    }

}
