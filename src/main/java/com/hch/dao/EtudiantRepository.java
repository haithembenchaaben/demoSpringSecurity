package com.hch.dao;

import com.hch.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
