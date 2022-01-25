package com.pogorelov.cursor.repository;

import com.pogorelov.cursor.entity.Agreement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementRepository extends JpaRepository<Agreement, Long> {

  List<Agreement> findAllByCounterPartyId(Long counterPartyId);
}
