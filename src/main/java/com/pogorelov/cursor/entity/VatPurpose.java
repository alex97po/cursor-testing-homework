package com.pogorelov.cursor.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum VatPurpose {

  VAT_NOT_APPLIED_ECONOMIC_ACTIVITY("Не оподатковується ПДВ, будь-яка господарська діяльність"),
  VAT_NOT_APPLIED_NOT_ECONOMIC_ACTIVITY("Не оподатковується ПДВ, не господарська діяльність"),
  VAT_APPLIED("Оподатковується ПДВ"),
  VAT_APPLIED_PROPORTIONALLY("Пропорційно оподатковується ПДВ");

  private final String name;

  public static VatPurpose ofName(String name) {
    return Arrays.stream(VatPurpose.values())
        .filter(taxPurpose -> taxPurpose.getName().equals(name))
        .findFirst()
        .orElse(null);
  }

  public static List<String> dropdownNames() {
    return Arrays.stream(VatPurpose.values())
        .map(VatPurpose::getName)
        .collect(Collectors.toList());
  }

}
