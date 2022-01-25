package com.pogorelov.cursor.mapper;

import com.pogorelov.cursor.dto.AgreementDto;
import com.pogorelov.cursor.entity.Agreement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CounterPartyMapper.class)
public interface AgreementMapper {

  AgreementDto toDto(Agreement entity);

  Agreement toEntity(AgreementDto dto);

}
