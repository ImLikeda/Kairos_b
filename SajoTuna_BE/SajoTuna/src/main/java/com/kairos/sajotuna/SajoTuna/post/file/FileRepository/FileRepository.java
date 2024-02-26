package com.kairos.sajotuna.SajoTuna.post.file.FileRepository;

import com.kairos.sajotuna.SajoTuna.post.file.FileEntity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity,Long> {
}
