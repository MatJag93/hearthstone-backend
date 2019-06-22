package com.matdom.hs.controller;

import com.matdom.hs.dtos.CardDTO;
import com.matdom.hs.mapper.CardMapper;
import com.matdom.hs.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private CardMapper cardMapper;

    @GetMapping("/all")
    public List<CardDTO> getCards(){
        return cardMapper.toCardListDTOs(cardService.getAllCards());
    }

    @GetMapping("/{id}")
    public CardDTO getCard(@PathVariable Long id) {
        return cardMapper.toCardDTO(cardService.getSingleCard(id));
    }

    @PostMapping
    public CardDTO addCard(@RequestBody CardDTO cardDTO) {
        return cardMapper.toCardDTO(cardService.saveCard(cardMapper.toCard(cardDTO)));
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardService.deleteSingleCard(id);
    }
}
