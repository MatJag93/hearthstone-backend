package com.matdom.hs.dtos;

import com.matdom.hs.domain.Card;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DeckDTO {

    private Long id;

    private String name;

    private String description;

    private List<Card> cardList = new ArrayList<>();
}
