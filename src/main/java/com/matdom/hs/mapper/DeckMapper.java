package com.matdom.hs.mapper;

import com.matdom.hs.domain.Deck;
import com.matdom.hs.dtos.DeckDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class DeckMapper {

    public abstract DeckDTO toDeckDTO(Deck deck);

    public abstract Deck toDeck(DeckDTO deckDTO);

    //    @Mapping(target = "cards", expression = "java(resolveCard(card))")
    public abstract List<DeckDTO> toDeckListDTOs(List<Deck> deckList);


//    public Card resolveCard(CardDTO card) {
//        return card.getId() == null
//                ? null
//                : Card.builder()
//                .id(card.getId())
//                .name(card.getName())
//                .description(card.getDescription())
//                .cardType(card.getCardType())
//                .health(card.getHealth())
//                .strength(card.getStrength())
//                .build();
//    }
}
