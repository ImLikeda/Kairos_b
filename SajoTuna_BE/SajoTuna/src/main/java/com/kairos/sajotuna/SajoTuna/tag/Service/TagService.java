package com.kairos.sajotuna.SajoTuna.tag.Service;

import com.kairos.sajotuna.SajoTuna.tag.Entity.TagEntity;
import com.kairos.sajotuna.SajoTuna.tag.Repository.TagRepository;
import com.kairos.sajotuna.SajoTuna.tag.dto.TagDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TagService {
    private final TagRepository tagRepository;

    public void save(TagDTO tagDTO) {
        TagEntity tagEntity = TagEntity.toTagEntity(tagDTO);
        tagRepository.save(tagEntity);
    }

    public TagEntity findById(int tagId) {
        return tagRepository.findByTagId(tagId);
    }
}
