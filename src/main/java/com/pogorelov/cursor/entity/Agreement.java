package com.pogorelov.cursor.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "agreement")
@Data
@ToString(exclude = "counterParty")
public class Agreement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "counter_party_id")
  private CounterParty counterParty;

  @Column(name = "number")
  private String number;

  @Column(name = "from_date")
  private LocalDate from;

  @Column(name = "name")
  private String name;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "buyer")
  private Boolean buyer;

  @Column(name = "supplier")
  private Boolean supplier;

}
