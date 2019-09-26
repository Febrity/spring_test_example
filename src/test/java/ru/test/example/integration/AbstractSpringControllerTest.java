package ru.test.example.integration;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.test.example.controller.TagController;
import ru.test.example.repository.TagsRepository;
import ru.test.example.repository.TagsTypeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractSpringControllerTest {

    @Autowired
    TagsTypeRepository tagsTypeRepository;

    @Autowired
    TagsRepository tagsRepository;

    @Autowired
    TagController tagController;
}
