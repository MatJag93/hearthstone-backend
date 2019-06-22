package com.matdom.hs.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vavr.collection.Stream;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Race {
    NONE("none"),
    BEAST("beast"),
    DEMON("demon"),
    DRAGON("dragon"),
    ELEMENTAL("elemental"),
    MECH("mech"),
    MURLOC("murloc"),
    PIRATE("pirate"),
    TOTEM("totem");

    @JsonValue
    private final String type;

    @JsonCreator
    public static Race fromType(@NonNull String type) {
        return Stream.of(values())
                .find(cardRace ->
                        type.equalsIgnoreCase(cardRace.getType()))
                .getOrNull();
    }
}
