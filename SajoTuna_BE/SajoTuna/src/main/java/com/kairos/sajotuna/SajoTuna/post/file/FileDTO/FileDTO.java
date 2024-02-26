package com.kairos.sajotuna.SajoTuna.post.file.FileDTO;

import com.kairos.sajotuna.SajoTuna.post.file.FileEntity.FileEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileDTO {
    private int id;
    private byte[] file;

    public static FileDTO toFileDTO(FileEntity fileEntity){
        FileDTO fileDTO = new FileDTO();
        fileDTO.setId(fileEntity.getFileId());
        fileDTO.setFile(fileEntity.getFile());
        return fileDTO;
    }
}
