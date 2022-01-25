package com.pogorelov.cursor.mapper;

import com.pogorelov.cursor.dto.AgreementDto;
import com.pogorelov.cursor.dto.CounterPartyDto;
import com.pogorelov.cursor.dto.CounterPartySettlementDto;
import com.pogorelov.cursor.entity.CounterPartySettlement;
import com.pogorelov.cursor.repository.AgreementRepository;
import com.pogorelov.cursor.repository.CounterPartyRepository;
import java.util.Objects;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Slf4j
public abstract class CounterPartySettlementMapperDecorator implements CounterPartySettlementMapper {

  @Autowired
  private CounterPartyRepository counterPartyRepository;

  @Autowired
  private AgreementRepository agreementRepository;

  @Autowired
  @Qualifier("delegate")
  private CounterPartySettlementMapper delegate;

  @Override
  public CounterPartySettlement toEntity(CounterPartySettlementDto counterPartySettlementDto) {
    CounterPartySettlement counterPartySettlement = delegate.toEntity(counterPartySettlementDto);

    if (Objects.nonNull(counterPartySettlement)) {
      Optional.ofNullable(counterPartySettlementDto.getCounterParty())
          .map(CounterPartyDto::getId)
          .flatMap(counterPartyRepository::findById)
          .ifPresent(counterPartySettlement::setCounterParty);

      Optional.ofNullable(counterPartySettlementDto.getAgreement())
          .map(AgreementDto::getId)
          .flatMap(agreementRepository::findById)
          .ifPresent(counterPartySettlement::setAgreement);
    }

    return counterPartySettlement;
  }
}
