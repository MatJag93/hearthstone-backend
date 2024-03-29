package com.matdom.hs.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vavr.collection.Stream;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CardType {
    MINION("minion"),
    SPELL("spell"),
    WEAPON("weapon"),
    HERO("hero");

    @JsonValue
    private final String type;

    @JsonCreator
    public static CardType fromType(@NonNull String type) {
        return Stream.of(values())
                .find(cardType ->
                        type.equalsIgnoreCase(cardType.getType()))
                .getOrNull();
    }
}
