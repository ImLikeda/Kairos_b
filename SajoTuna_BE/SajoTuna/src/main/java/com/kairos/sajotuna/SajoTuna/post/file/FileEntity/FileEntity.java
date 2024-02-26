package com.kairos.sajotuna.SajoTuna.post.file.FileEntity;

import com.kairos.sajotuna.SajoTuna.post.file.FileDTO.FileDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "files")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id",nullable = false)
    private int fileId;
    @Lob
    @Column(name = "file",nullable = false)
    private byte[] file;

    public static FileEntity toFileEntity(FileDTO fileDTO){
        FileEntity fileEntity = new FileEntity();
        fileEntity.setFileId(fileDTO.getId());
        fileEntity.setFile(fileDTO.getFile());
        return fileEntity;
    }

}
