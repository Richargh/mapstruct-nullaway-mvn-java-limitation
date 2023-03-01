package de.richargh.mapstructlimitation.rent.domain;

import de.richargh.mapstructlimitation.commons.annotations.Nullable;

public record RentStats(Renter renter, @Nullable Item firstRent, @Nullable Item lastRent) {

}
