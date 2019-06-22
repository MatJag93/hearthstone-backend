package com.matdom.hs.domain;

import com.matdom.hs.enums.CardType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
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

    @ManyToMany(mappedBy = "cards")
    private List<Deck> decks = new ArrayList<>();
}
