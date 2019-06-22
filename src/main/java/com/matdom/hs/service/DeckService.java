package com.matdom.hs.service;

import com.matdom.hs.domain.Deck;
import com.matdom.hs.exceptions.ResourceNotFoundException;
import com.matdom.hs.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeckService {
    @Autowired
    private DeckRepository deckRepository;

    public List<Deck> getAllDecks() {
        return new ArrayList<>(deckRepository.findAll());
    }

    public Deck getSingleDeck(Long id) {
        return deckRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Deck", "id", id));
    }

    @Transactional
    public Deck saveDeck(Deck deck) {
        return deckRepository.save(deck);
    }

    public void deleteSingleDeck(Long id) {
        deckRepository.deleteById(id);
    }
}
