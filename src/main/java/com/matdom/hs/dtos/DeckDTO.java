package com.matdom.hs.dtos;

import com.matdom.hs.domain.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Data
@Builder
@AllArgsConstructor
public class DeckDTO {

    private Long id;

    private String name;

    private String description;

    @Builder.Default
    private List<Card> cards = new ArrayList<>();

    public DeckDTO() {
        cards = newArrayList();
    }
}
