package com.pogorelov.cursor.repository;

import com.pogorelov.cursor.entity.CounterPartySettlement;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterPartySettlementRepository extends JpaRepository<CounterPartySettlement, Long> {

  Optional<CounterPartySettlement> findByCounterPartyIdAndAgreementId(Long counterPartyId, Long agreementId);

  Optional<CounterPartySettlement> findByCounterPartyIdAndAgreementIdIsNull(Long counterPartyId);

  Optional<CounterPartySettlement> findByCounterPartyIdIsNullAndAgreementIdIsNull();

}
