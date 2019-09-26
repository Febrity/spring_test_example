package ru.test.example.repository;

import org.springframework.data.repository.CrudRepository;
import ru.test.example.entity.Tag;

import java.util.List;
import java.util.Optional;

public interface TagsRepository extends CrudRepository<Tag, Long> {
    Optional<Tag> findByName(String name);
    List<Tag> findAllByTypeNameOrderByNameAsc(String type);
}
