package org.example.nfjavaasterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("asterix")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterMapper characterMapper;
    private final CharacterService characterService;

    @GetMapping({"character","character/"}) // provide multiple entry points
    public List<CharacterDTO> findAll() {
        return characterService.findAll().stream()
                .map(characterMapper::toCharacterDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public CharacterDTO findById(@PathVariable String id) {
        return new CharacterMapper().toCharacterDTO(characterService.findById(id));
    }

    // TODO: add controller methods

//    @PostMapping
//    public Character saveCharacter(@RequestBody Character character) {
//        return characterService.save(character);
//    }
//
//    @PutMapping("/{id}")
//    public Character updateCharacter(@PathVariable String id, @RequestBody Character character) {
//            return characterService.save(
//                    characterService.findById(id).orElseThrow()
//            );
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable String id) {
//        characterService.deleteById(id);
//    }
}