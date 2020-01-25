package com.architecture.hexagonal.domain;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.Data;

@Data
public class Account {

  private UUID id;
  private BigDecimal creditBalance;
  private BigDecimal paydownBalance;

}
