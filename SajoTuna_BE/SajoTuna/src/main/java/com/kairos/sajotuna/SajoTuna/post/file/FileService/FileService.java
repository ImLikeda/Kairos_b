package com.kairos.sajotuna.SajoTuna.post.file.FileService;

import com.kairos.sajotuna.SajoTuna.post.file.FileDTO.FileDTO;
import com.kairos.sajotuna.SajoTuna.post.file.FileEntity.FileEntity;
import com.kairos.sajotuna.SajoTuna.post.file.FileRepository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;
    public void saveFile(FileDTO fileDTO){
        FileEntity fileEntity = FileEntity.toFileEntity(fileDTO);
        fileRepository.save(fileEntity);
    }

}
