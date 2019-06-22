package com.matdom.hs.domain;

import com.matdom.hs.enums.CardType;
import com.matdom.hs.enums.PlayerClass;
import com.matdom.hs.enums.Race;
import com.matdom.hs.enums.Rarity;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

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

    @Column(name = "image_resource_url")
    private String imageResourceUrl;

    @CreationTimestamp
    @Column(name = "creation_time", updatable = false)
    private ZonedDateTime createdTime;

    @UpdateTimestamp
    @Column(name = "modification_time")
    private ZonedDateTime updatedTime;

    private Rarity rarity;

    private Race race;

    @Column(name = "player_class")
    private PlayerClass playerClass;

    private Integer strength;

    private Integer health;

    private Integer cost;

    @Column(name = "card_type")
    @Enumerated(STRING)
    private CardType cardType;
}
