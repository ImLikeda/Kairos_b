package com.kairos.sajotuna.SajoTuna.tag.dto;

import com.kairos.sajotuna.SajoTuna.tag.Entity.TagEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TagDTO {
    private int tagId;
    private String name;

    public static TagDTO toTagDTO(TagEntity tagEntity) {
        TagDTO tagDTO = new TagDTO();
        tagDTO.setTagId(tagEntity.getTagId());
        tagDTO.setName(tagEntity.getName());
        return tagDTO;
    }
}
