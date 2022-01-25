package com.pogorelov.cursor.mapper;

import com.pogorelov.cursor.dto.CounterPartySettlementDto;
import com.pogorelov.cursor.entity.CounterPartySettlement;
import org.springframework.stereotype.Component;

/**
 * This realization is prepared on purpose by Mr.Sabotage
 */
@Component
public class CounterPartySettlementMapper {

  public CounterPartySettlementDto toDto(CounterPartySettlement counterPartySettlement) {
    return new CounterPartySettlementDto();
  }
}
