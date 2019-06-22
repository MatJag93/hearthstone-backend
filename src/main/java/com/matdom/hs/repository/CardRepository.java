package com.matdom.hs.repository;

import com.matdom.hs.enums.CardType;
import com.matdom.hs.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    List<CardType> findAllByCardType(CardType cardType);
}
