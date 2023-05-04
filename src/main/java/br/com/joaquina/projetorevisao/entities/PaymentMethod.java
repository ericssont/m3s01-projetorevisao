package br.com.joaquina.projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@Entity
public class PaymentMethod {

    @Id
    @Column(name = "payment_method_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean isCard = Boolean.FALSE;

}
