package org.example.nfjavaasterixapi;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public List<Character> findAll() {
        return characterRepository.findAll();
    }

    public Character findById(String id) {
        return characterRepository.findById(id)
                .orElseThrow();
    }









    // TODO: IMPLEMENT METHODS TEST DRIVEN

//    public Character findById(String id) {
//        return characterRepository.findById(id)
//                .orElseThrow();
//    }
//
//    public Character save(Character character) {
//        String uuid = UUID.randomUUID().toString();
//        Character characterToSave = character.withId(uuid);
//
//        return characterRepository.save(characterToSave);
//    }
//
//    public void deleteById(String id) {
//        if (characterRepository.existsById(id)) {
//            characterRepository.deleteById(id);
//        }
//        else {
//            throw new NoSuchElementException("Character with id: " + id + " not found!");
//        }
//    }

}
