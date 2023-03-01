package de.richargh.mapstructlimitation.rent.translate;

import de.richargh.mapstructlimitation.rent.domain.Renter;
import de.richargh.mapstructlimitation.rent.dto.RenterDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

@Mapper(
        //        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValueMappingStrategy =
        NullValueMappingStrategy.RETURN_DEFAULT)
public interface RenterTranslator {

    @Mapping(source = "id", target = "id.rawValue")
    Renter dtoToRenter(RenterDto dto);

    @Mapping(source = "id.rawValue", target = "id")
    RenterDto RenterToDto(Renter renter);
}
