package de.richargh.mapstructlimitation.rent.translate;

import de.richargh.mapstructlimitation.rent.domain.RentStats;
import de.richargh.mapstructlimitation.rent.dto.RentStatsDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

@Mapper(
        //        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION, nullValueMappingStrategy =
        NullValueMappingStrategy.RETURN_DEFAULT, uses = {
        ItemTranslator.class, RenterTranslator.class})
public interface RentStatsTranslator {

    RentStats dtoToRentStats(RentStatsDto dto);

    RentStatsDto RentStatsToDto(RentStats stats);
}
