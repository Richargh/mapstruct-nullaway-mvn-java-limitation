package de.richargh.mapstructlimitation.rent.dto;

import de.richargh.mapstructlimitation.commons.annotations.Nullable;

public record RentStatsDto(RenterDto renter, @Nullable ItemDto firstRent, @Nullable ItemDto lastRent) {

}
