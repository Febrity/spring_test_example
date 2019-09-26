package ru.test.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.example.entity.Tag;
import ru.test.example.entity.TagType;
import ru.test.example.repository.TagsRepository;
import ru.test.example.repository.TagsTypeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultTagService {

    private final TagsRepository tagsRepository;
    private final TagsTypeRepository tagsTypeRepository;

    public List<Tag> getTags() {
        return (List<Tag>) tagsRepository.findAll();
    }

    public List<Tag> getTagsByType(String type) {
        return tagsRepository.findAllByTypeNameOrderByNameAsc(type);
    }

    public List<TagType> getTagTypes() {
        return tagsTypeRepository.findAllByOrderByNameAsc();
    }

    public void deleteTag(Long id) {
        tagsRepository.deleteById(id);
    }

    public void deleteTagType(String name) {
        tagsTypeRepository.deleteByName(name);
    }

    public void deleteAllTags() {
        tagsRepository.deleteAll();
    }
}
