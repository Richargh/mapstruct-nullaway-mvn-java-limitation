package de.richargh.mapstructlimitation.rent.translate;

import de.richargh.mapstructlimitation.rent.domain.Item;
import de.richargh.mapstructlimitation.rent.dto.ItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ItemTranslator {

    @Mapping(source = "id", target = "id.rawValue")
    Item dtoToItem(ItemDto dto);

    @Mapping(source = "id.rawValue", target = "id")
    ItemDto itemToDto(Item item);
}
