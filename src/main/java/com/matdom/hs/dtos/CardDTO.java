package com.matdom.hs.dtos;

import com.matdom.hs.enums.CardType;
import lombok.Data;

@Data
public class CardDTO {

    private Long id;

    private String name;

    private String description;

    private Integer strength;

    private Integer health;

    private CardType cardType;

}
