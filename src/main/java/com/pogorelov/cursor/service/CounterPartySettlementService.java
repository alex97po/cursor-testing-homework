package com.pogorelov.cursor.service;

import com.pogorelov.cursor.dto.CounterPartySettlementDto;
import com.pogorelov.cursor.mapper.CounterPartySettlementMapper;
import com.pogorelov.cursor.repository.CounterPartySettlementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CounterPartySettlementService {

  private final CounterPartySettlementMapper counterPartySettlementMapper;

  private final CounterPartySettlementRepository counterPartySettlementRepository;

  @Transactional(readOnly = true)
  public CounterPartySettlementDto searchCounterPartiesSettlements(Long counterPartyId, Long agreementId) {
    CounterPartySettlementDto searchedCounterPartySettlementsDto = counterPartySettlementRepository
        .findByCounterPartyIdAndAgreementId(counterPartyId, agreementId)
        .or(() -> counterPartySettlementRepository.findByCounterPartyIdAndAgreementIdIsNull(counterPartyId))
        .or(counterPartySettlementRepository::findByCounterPartyIdIsNullAndAgreementIdIsNull)
        .map(counterPartySettlementMapper::toDto)
        .orElseGet(CounterPartySettlementDto::new);
    log.info("Found counter party settlement for counter party id {} and agreement id {} : {} ",
        counterPartyId, agreementId, searchedCounterPartySettlementsDto);
    return searchedCounterPartySettlementsDto;
  }

}
