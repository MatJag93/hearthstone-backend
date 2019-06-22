package com.matdom.hs.mapper;

import com.matdom.hs.domain.Card;
import com.matdom.hs.dtos.CardDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CardMapper {

    public abstract CardDTO toCardDTO(Card card);

    @Mapping(target = "createdTime", ignore = true)
    public abstract Card toCard(CardDTO cardDTO);

    public abstract List<CardDTO> toCardListDTOs(List<Card> cardList);
}
