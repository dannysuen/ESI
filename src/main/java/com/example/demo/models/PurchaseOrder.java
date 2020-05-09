package com.example.demo.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class PurchaseOrder {
    @Id
    @GeneratedValue
    Long id;

    @OneToMany
    List<PlantReservation> reservations;

    @ManyToOne
    PlantInventoryEntry plant;

    @Embedded
    BusinessPeriod businessPeriod;

    @Column(precision = 8, scale = 2)
    BigDecimal total;

    @Enumerated(EnumType.STRING)
    POStatus status;
}
