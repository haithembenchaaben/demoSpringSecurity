package com.hch.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    private String prenom;

    private Date dateNaissance;
}
