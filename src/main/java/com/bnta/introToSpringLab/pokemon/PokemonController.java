package com.bnta.introToSpringLab.pokemon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @GetMapping
    public List<String> getPokemon(){
        return Arrays.asList("Hello", "I", "Am", "Here");
    }
}
