package ru.test.example.repository;

import org.springframework.data.repository.CrudRepository;
import ru.test.example.entity.TagType;

import java.util.List;
import java.util.Optional;

public interface TagsTypeRepository extends CrudRepository<TagType, Long> {
    Optional<TagType> findByName(String name);
    List<TagType> findAllByOrderByNameAsc();
    void deleteByName(String name);
}
