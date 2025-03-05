package com.example.payment.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    private Double amount;
}