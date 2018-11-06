package com.hch.service;

import com.hch.entities.Etudiant;
import com.hch.resources.EtudiantResource;

import java.text.ParseException;
import java.util.List;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
public interface EtudiantService {
                    void save(EtudiantResource etudiant) throws ParseException;
                    void delete(EtudiantResource etudiant) throws ParseException;
                    List<EtudiantResource> findAll();
}
