package com.matdom.hs.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vavr.collection.Stream;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public enum Rarity {
    FREE("free"),
    COMMON("common"),
    RARE("rare"),
    EPIC("epic"),
    LEGENDARY("legendary");

    @JsonValue
    private final String type;

    @JsonCreator
    public static Rarity fromType(@NonNull String type) {
        return Stream.of(values())
                .find(cardRarity ->
                        type.equalsIgnoreCase(cardRarity.getType()))
                .getOrNull();
    }
}
