package com.pogorelov.cursor.mapper;

import com.pogorelov.cursor.dto.CounterPartySettlementDto;
import com.pogorelov.cursor.entity.CounterPartySettlement;
import java.util.List;
import org.mapstruct.DecoratedWith;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CounterPartyMapper.class, AgreementMapper.class})
@DecoratedWith(CounterPartySettlementMapperDecorator.class)
public interface CounterPartySettlementMapper {

  CounterPartySettlementDto toDto(CounterPartySettlement counterPartySettlement);

  @IterableMapping(elementTargetType = CounterPartySettlementDto.class)
  List<CounterPartySettlementDto> toDto(List<CounterPartySettlement> counterPartySettlements);

  @Mapping(target = "counterParty", ignore = true)
  @Mapping(target = "agreement", ignore = true)
  CounterPartySettlement toEntity(CounterPartySettlementDto counterPartySettlementDto);

}
