package com.example.BloodDonation.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Beneficaire implements Serializable {
    @Id
    @SequenceGenerator(name = "beneficaire_sequence",
    sequenceName ="beneficaire_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,
    generator = "beneficaire_sequence")
    private Long idBeneficaire;
    
    private String nom;
    private String mail;
    private String telephone;
    private String password;
    private String imageURL;
    private String adresse;
    private Boolean doneur;
    @ManyToOne()
    @JoinColumn(name = "type_de_sang",referencedColumnName = "type")
    private Sang sang;
}
//Please use Lombok annotation
