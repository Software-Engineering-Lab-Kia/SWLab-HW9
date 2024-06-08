package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @InjectMocks
    Person person = new Person();

    @InjectMocks
    PersonRepository repository = new PersonRepository();

    @Test
    void insert() {
        assertEquals(repository.insert(person), person);
        try {
            repository.insert(null);
            fail();
        } catch (Exception ignored){
            assertTrue(true);
        }
    }

    @Test
    void update() {
        try {
            repository.update(null);
            fail();
        } catch (Exception ignored){
            assertTrue(true);
        }
    }

    @Test
    void delete() {
        try {
            repository.delete(null);
            fail();
        } catch (Exception ignored){
            assertTrue(true);
        }
    }

    @Test
    void get() {
        String name = "Amir";
        assertNull(repository.get(name));
        try {
            repository.get(null);
            fail();
        } catch (Exception e){
            assertTrue(true);
        }
    }
}