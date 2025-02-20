package org.example.nfjavaasterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asterix")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterRepository characterRepository;

    @GetMapping("/characters")
    public List<Character> sayHello() {
        return characterRepository.findAll();
    }
}
