package com.matdom.hs.controller;

import com.matdom.hs.dtos.DeckDTO;
import com.matdom.hs.mapper.DeckMapper;
import com.matdom.hs.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/decks")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @Autowired
    private DeckMapper deckMapper;

    @GetMapping
    public List<DeckDTO> getDecks() {
        return deckMapper.toDeckListDTOs(deckService.getAllDecks());
    }

    @GetMapping("/{id}")
    public DeckDTO getDeck(@PathVariable Long id) {
        return deckMapper.toDeckDTO(deckService.getSingleDeck(id));
    }

    @PostMapping
    public DeckDTO addDeck(@RequestBody DeckDTO deckDTO) {
        return deckMapper.toDeckDTO(deckService.saveDeck(deckMapper.toDeck(deckDTO)));
    }

    @DeleteMapping("/{id}")
    public void deleteDeck(@PathVariable Long id) {
        deckService.deleteSingleDeck(id);
    }
}
