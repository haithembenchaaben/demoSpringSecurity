package com.hch.dao;

import com.hch.entities.Etudiant;
import com.hch.exception.SaveDataException;

import java.util.List;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
public interface EtudiantDao {
    void save(Etudiant etudiant) throws SaveDataException;
    void delete(Etudiant etudiant);
    List<Etudiant> findAll();

}
