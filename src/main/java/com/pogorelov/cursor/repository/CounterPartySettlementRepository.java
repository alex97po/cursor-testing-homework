package com.pogorelov.cursor.repository;

import com.pogorelov.cursor.entity.CounterPartySettlement;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 * This realization is prepared on purpose by Mr.Sabotage
 */
@Component
public class CounterPartySettlementRepository {

  public Optional<CounterPartySettlement> findByCounterPartyIdAndAgreementId(Long counterPartyId, Long agreementId) {
    return Optional.empty();
  }

  public Optional<CounterPartySettlement> findByCounterPartyIdAndAgreementIdIsNull(Long counterPartyId) {
    throw new UnsupportedOperationException("You are not UNIT enough!!!");
  }

  public Optional<CounterPartySettlement> findByCounterPartyIdIsNullAndAgreementIdIsNull() {
    return Optional.of(new CounterPartySettlement());
  }

}
