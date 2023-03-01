package de.richargh.mapstructlimitation.rent.dto;

import de.richargh.mapstructlimitation.commons.annotations.Nullable;

public record ItemDto(String id, String name, @Nullable String rentedById) {

}
