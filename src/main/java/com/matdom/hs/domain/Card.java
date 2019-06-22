package com.matdom.hs.domain;

import com.matdom.hs.enums.CardType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "card_name")
    private String name;

    private String description;

    private Integer strength;

    private Integer health;

    @Column(name = "card_type")
    @Enumerated(STRING)
    private CardType cardType;

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", cardType=" + cardType +
                '}';
    }

    public Card(String name, String description, Integer strength, Integer health, CardType cardType) {
        this.name = name;
        this.description = description;
        this.strength = strength;
        this.health = health;
        this.cardType = cardType;
    }

    public Card() {
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
