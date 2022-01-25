package com.pogorelov.cursor.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum VatRate {

  ZERO("0%", 0),
  SEVEN("7%", 7),
  FOURTEEN("14%", 14),
  TWENTY("20%", 20),
  NOT_VAT("Не ПДВ", 0),
  WITHOUT_VAT("Без ПДВ", 0);

  private final String name;
  private final Integer value;

  public static VatRate ofName(String name) {
    return Arrays.stream(VatRate.values())
        .filter(vatRate -> vatRate.getName().equals(name))
        .findFirst()
        .orElse(null);
  }

  public static List<String> dropdownNames() {
    return Arrays.stream(VatRate.values())
        .map(VatRate::getName)
        .collect(Collectors.toList());
  }

}
