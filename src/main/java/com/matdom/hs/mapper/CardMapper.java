package com.matdom.hs.mapper;

import com.matdom.hs.domain.Card;
import com.matdom.hs.dtos.CardDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CardMapper {

    public abstract CardDTO toCardDTO(Card card);

    public abstract Card toCard(CardDTO cardDTO);

    public abstract List<CardDTO> toCardListDTOs(List<Card> cardList);
}
