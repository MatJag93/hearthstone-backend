package com.matdom.hs.dtos;

import com.matdom.hs.enums.CardType;

public class CardDTO {

    private Long id;

    private String name;

    private String description;

    private Integer strength;

    private Integer health;

    private CardType cardType;

    public CardDTO(Long id, String name, String description, Integer strength, Integer health, CardType cardType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.strength = strength;
        this.health = health;
        this.cardType = cardType;
    }

    public CardDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
