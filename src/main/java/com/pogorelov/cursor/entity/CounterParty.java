package com.pogorelov.cursor.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "counter_party")
@Data
public class CounterParty {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "resident")
  private Boolean resident;

  @Column(name = "edrpou")
  private String edrpouCode;

  @Column(name = "inn")
  private String inn;

  @Column(name = "licence")
  private String licence;

  @Column(name = "branch")
  private Boolean branch;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "main_counter_party_id")
  private CounterParty main;

  @Column(name = "branch_id")
  private Integer branchId;

  @OneToMany(mappedBy = "counterParty")
  private List<Agreement> agreements = new ArrayList<>();

}
