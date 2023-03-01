package de.richargh.mapstructlimitation.rent.domain;

import de.richargh.mapstructlimitation.commons.annotations.Nullable;

public record Item(ItemId id, String name, @Nullable RenterId rentedBy) {

    public boolean isRented() {
        return rentedBy != null;
    }
}
