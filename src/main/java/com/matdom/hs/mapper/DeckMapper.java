package com.matdom.hs.mapper;

import com.matdom.hs.domain.Deck;
import com.matdom.hs.dtos.DeckDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class DeckMapper {

    public abstract DeckDTO toDeckDTO(Deck deck);

    public abstract Deck toDeck(DeckDTO deckDTO);

    public abstract List<DeckDTO> toDeckListDTOs(List<Deck> deckList);
}
