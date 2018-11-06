package com.hch.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantResource  {
    private Long id;

    private String nom;

    private String prenom;

    private String dateNaissance;
}
