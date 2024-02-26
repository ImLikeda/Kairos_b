package com.kairos.sajotuna.SajoTuna.tag.Repository;

import com.kairos.sajotuna.SajoTuna.tag.Entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {
    public TagEntity findByTagId(int TagId);

}
