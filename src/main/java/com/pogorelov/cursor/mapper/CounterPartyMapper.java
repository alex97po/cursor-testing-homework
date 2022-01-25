package com.pogorelov.cursor.mapper;

import com.pogorelov.cursor.dto.CounterPartyDto;
import com.pogorelov.cursor.entity.CounterParty;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AgreementMapper.class)
public interface CounterPartyMapper {

  CounterPartyDto toDto(CounterParty entity);

  CounterParty toEntity(CounterPartyDto dto);

}
