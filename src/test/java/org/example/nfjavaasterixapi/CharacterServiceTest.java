package org.example.nfjavaasterixapi;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CharacterServiceTest {

    // MOCKING CHARACTER REPO AND SET UP SERVICE
    private final CharacterRepository mockCharacterRepository = mock(CharacterRepository.class);
    CharacterService characterService = new CharacterService(mockCharacterRepository);

    @Test
    void findAll_ReturnsList() {
        List<Character> expected = new ArrayList<>(Arrays.asList(
                new Character("1", "test", 0, "test"),
                new Character("2", "test", 0, "test"),
                new Character("3", "test", 0, "test")
        ));
        when(mockCharacterRepository.findAll()).thenReturn(expected);

        List<Character> actual = characterService.findAll();

        verify(mockCharacterRepository).findAll();
        assertEquals(expected, actual);
    }

    @Test
    void findById_WhenCharacterExists_ReturnsCharacter() {
        String id = "1";
        Character expected = new Character(id, "test", 0, "test");
        when(mockCharacterRepository.findById(id)).thenReturn(Optional.of(expected));

        Character actual = characterService.findById(id);

        verify(mockCharacterRepository).findById(id);
        assertEquals(expected, actual);
    }

    @Test
    void findById_WhenCharacterDoesNotExist_ThrowsException() {
        String id = "nonexistent";
        when(mockCharacterRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> characterService.findById(id));
        verify(mockCharacterRepository).findById(id);
    }

    // TODO: add more tests

}