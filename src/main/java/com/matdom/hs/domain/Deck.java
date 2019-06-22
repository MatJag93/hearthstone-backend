package com.matdom.hs.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "decks")
public class Deck {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "deck_name")
    private String name;

    private String description;

    @ManyToMany(cascade = ALL)
    @JoinTable(
            name = "decks_cards_relation",
            joinColumns = {@JoinColumn(name = "deck_id")},
            inverseJoinColumns = {@JoinColumn(name = "card_id")}
    )
    List<Card> cards = new ArrayList<>();

}