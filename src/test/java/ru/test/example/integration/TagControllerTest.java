package ru.test.example.integration;

import org.junit.Test;
import org.springframework.http.HttpStatus;

import static org.junit.Assert.*;

public class TagControllerTest extends AbstractSpringControllerTest {

    @Test
    public void checkTagsFromDB() {
        assertEquals(HttpStatus.OK, tagController.tags().getStatusCode());
    }

    @Test
    public void checkTagsTypeFromDB() {
        assertEquals(HttpStatus.OK, tagController.tagsType().getStatusCode());
    }

    @Test
    public void checkTagsTypesOnTypeFromDB() {
        assertEquals(HttpStatus.OK, tagController.tagsByType("Module").getStatusCode());
    }
}
