package com.pogorelov.cursor.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class AgreementDto {

  private Long id;

  private CounterPartyDto counterParty;

  private String number;

  private LocalDate from;

  private String name;

  private String fullName;

  private Boolean buyer;

  private Boolean supplier;

}
