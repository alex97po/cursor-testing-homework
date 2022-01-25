package com.pogorelov.cursor.dto;

import java.util.List;
import lombok.Data;

@Data
public class CounterPartyDto {

  private Long id;

  private String name;

  private String fullName;

  private Boolean resident;

  private String edrpouCode;

  private String inn;

  private String licence;

  private Boolean branch;

  private CounterPartyDto main;

  private Integer branchId;

  private List<AgreementDto> agreements;

}
