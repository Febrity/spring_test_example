package ru.test.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.example.entity.Tag;
import ru.test.example.entity.TagType;
import ru.test.example.service.DefaultTagService;

import java.util.List;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {

    private final DefaultTagService tagService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Tag>> tags() {
        List<Tag> tags = tagService.getTags();
        if(tags.isEmpty()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.ok().body(tags);
        }
    }

    @GetMapping(path = "/types", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<TagType>> tagsType() {
        List<TagType> tags = tagService.getTagTypes();
        return tags.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok().body(tags);
    }

    @GetMapping(path = "/types/{type}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Tag>> tagsByType(@PathVariable(name = "type") String type) {
        List<Tag> tags = tagService.getTagsByType(type);
        if(tags.isEmpty()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.ok().body(tags);
        }
    }
}
