package com.pogorelov.cursor.dto;

import com.pogorelov.cursor.entity.VatPurpose;
import com.pogorelov.cursor.entity.VatRate;
import lombok.Data;

@Data
public class CounterPartySettlementDto {

  private Long id;

  private CounterPartyDto counterParty;

  private AgreementDto agreement;

  private String settlementsWithSuppliers;

  private String advancesIssued;

  private String settlementsWithBuyers;

  private String advancesReceived;

  private String barterSettlementsWithSuppliers;

  private String barterSettlementsWithBuyers;

  private String billVatReceipts;

  private String billVatReceiptsConfirmed;

  private String billVatSales;

  private String billVatSalesConfirmed;

  private VatRate incomesVatRate;

  private VatRate salesVatRate;

  private VatPurpose vatPurpose;

}
