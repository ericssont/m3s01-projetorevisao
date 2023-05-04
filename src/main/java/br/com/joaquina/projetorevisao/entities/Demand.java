package br.com.joaquina.projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Demand {

    @Id
    @Column(name = "demand_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date dateOrdered = new Date();

    @JoinColumn(nullable = false)
    @ManyToOne
    private Customer customer;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal totalItems;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DemandItem> items = new ArrayList<>();

}
