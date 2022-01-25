package com.pogorelov.cursor.repository;

import com.pogorelov.cursor.entity.CounterParty;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CounterPartyRepository extends JpaRepository<CounterParty, Long> {

  Optional<CounterParty> findByEdrpouCode(String edrpou);

  @Query("SELECT DISTINCT cp FROM CounterParty cp JOIN cp.agreements a WHERE a.buyer = true")
  List<CounterParty> findAllBuyers();

  @Query("SELECT DISTINCT cp FROM CounterParty cp JOIN cp.agreements a WHERE a.supplier = true")
  List<CounterParty> findAllSuppliers();

}
