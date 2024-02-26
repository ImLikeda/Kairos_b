package com.kairos.sajotuna.SajoTuna.tag.Entity;

import com.kairos.sajotuna.SajoTuna.tag.dto.TagDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tag")
public class TagEntity {
    @Id
    @Column(name = "tagId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagId;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    public static TagEntity toTagEntity(TagDTO tagDTO){
        TagEntity tagEntity = new TagEntity();
        tagEntity.setTagId(tagDTO.getTagId());
        tagEntity.setName(tagDTO.getName());
        return tagEntity;
    }
}
