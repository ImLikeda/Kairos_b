package com.kairos.sajotuna.SajoTuna.tag.Controller;

import com.kairos.sajotuna.SajoTuna.tag.Entity.TagEntity;
import com.kairos.sajotuna.SajoTuna.tag.Service.TagService;
import com.kairos.sajotuna.SajoTuna.tag.dto.TagDTO;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tag")
public class TagController {
    private final TagService tagService;

    @GetMapping("/post")
    public String saveForm() { return "tag posted"; }

    @GetMapping("/find/{tagId}")
    public ResponseEntity<TagDTO> getTag(@PathVariable("tagId") int tag_id) {

        if (tagService.findById(tag_id) == null) {
            return ResponseEntity.notFound().build(); // 404 리턴해야됨
        } else {
            TagDTO tagDTO = TagDTO.toTagDTO(tagService.findById(tag_id));
            return new ResponseEntity<>(tagDTO, HttpStatus.OK);
        }
    }

    @PostMapping("/post")
    public void post(@RequestBody TagDTO tagDTO, HttpServletResponse response) {
        tagService.save(tagDTO);
    }

}
