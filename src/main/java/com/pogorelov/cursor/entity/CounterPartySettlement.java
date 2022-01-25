package com.pogorelov.cursor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "counter_party_settlement")
@Data
public class CounterPartySettlement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "counter_party_id")
  private CounterParty counterParty;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "agreement_id")
  private Agreement agreement;

  @Column(name = "settlements_with_suppliers")
  private String settlementsWithSuppliers;

  @Column(name = "advances_issued")
  private String advancesIssued;

  @Column(name = "settlements_with_buyers")
  private String settlementsWithBuyers;

  @Column(name = "advances_received")
  private String advancesReceived;

  @Column(name = "barter_settlements_with_suppliers")
  private String barterSettlementsWithSuppliers;

  @Column(name = "barter_settlements_with_buyers")
  private String barterSettlementsWithBuyers;

  @Column(name = "bill_vat_receipts")
  private String billVatReceipts;

  @Column(name = "bill_vat_receipts_confirmed")
  private String billVatReceiptsConfirmed;

  @Column(name = "bill_vat_sales")
  private String billVatSales;

  @Column(name = "bill_vat_sales_confirmed")
  private String billVatSalesConfirmed;

  @Enumerated(EnumType.STRING)
  @Column(name = "incomes_vat_rate")
  private VatRate incomesVatRate;

  @Enumerated(EnumType.STRING)
  @Column(name = "sales_vat_rate")
  private VatRate salesVatRate;

  @Enumerated(EnumType.STRING)
  @Column(name = "vat_purpose")
  private VatPurpose vatPurpose;

}
