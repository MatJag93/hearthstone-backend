package com.matdom.hs.service;

import com.matdom.hs.domain.Card;
import com.matdom.hs.exception.ResourceNotFoundException;
import com.matdom.hs.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCards() {
        return new ArrayList<>(cardRepository.findAll());
    }

    public Card getSingleCard(Long id) {
        return cardRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Card", "id", id));
    }

    @Transactional
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }

    public void deleteSingleCard(Long id) {
        cardRepository.deleteById(id);
    }
}
