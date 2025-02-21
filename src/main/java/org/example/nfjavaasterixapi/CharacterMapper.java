package org.example.nfjavaasterixapi;

import org.springframework.stereotype.Component;

@Component
public class CharacterMapper {

    public CharacterDTO toCharacterDTO(Character character) {
        return new CharacterDTO(
                character.id(),
                character.name(),
                character.age(),
                character.profession()
        );
    }

    public CharacterNewDTO toCreateCharacterDTO(Character character) {
        return new CharacterNewDTO(
                character.name(),
                character.age(),
                character.profession()
        );
    }
}
