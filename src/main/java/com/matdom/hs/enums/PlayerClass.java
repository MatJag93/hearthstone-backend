package com.matdom.hs.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vavr.collection.Stream;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PlayerClass {
    NEUTRAL("neutral"),
    PRIEST("priest"),
    MAGE("mage"),
    PALADIN("paladin"),
    WARRIOR("warrior"),
    ROGUE("rogue"),
    DRUID("druid"),
    SHAMAN("shaman"),
    WARLOCK("warlock"),
    HUNTER("hunter");

    @JsonValue
    private final String type;

    @JsonCreator
    public static PlayerClass fromType(@NonNull String type) {
        return Stream.of(values())
                .find(playerClass ->
                        type.equalsIgnoreCase(playerClass.getType()))
                .getOrNull();
    }
}
