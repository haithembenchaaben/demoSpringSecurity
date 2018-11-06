package com.hch.service;

import com.hch.dao.EtudiantDao;
import com.hch.entities.Etudiant;
import com.hch.mappers.EtudiantMapper;
import com.hch.resources.EtudiantResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
@Service
public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    private EtudiantDao etudiantDao;
    @Override
    public void save(EtudiantResource etudiant) throws ParseException {

        etudiantDao.save(EtudiantMapper.mapReourceToEntity(etudiant));
    }

    @Override
    public void delete(EtudiantResource etudiant) throws ParseException {
         etudiantDao.delete(EtudiantMapper.mapReourceToEntity(etudiant));
    }

    @Override
    public List<EtudiantResource> findAll() {

        return EtudiantMapper.mapEntitiesToResources(etudiantDao.findAll());
    }
}
