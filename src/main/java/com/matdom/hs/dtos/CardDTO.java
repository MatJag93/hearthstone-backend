package com.matdom.hs.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.matdom.hs.enums.CardType;
import com.matdom.hs.enums.PlayerClass;
import com.matdom.hs.enums.Race;
import com.matdom.hs.enums.Rarity;
import lombok.Data;

import java.time.ZonedDateTime;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@JsonInclude(NON_NULL)
public class CardDTO {

    private Long id;

    private String name;

    private String description;

    private Integer strength;

    private Integer health;

    private CardType cardType;

    private String imageResourceUrl;

    private ZonedDateTime updatedTime;

    private Rarity rarity;

    private Race race;

    private PlayerClass playerClass;

    private Integer cost;

}
