package com.hch.controller;

import com.hch.entities.Etudiant;
import com.hch.resources.EtudiantResource;
import com.hch.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;


/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */

@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;


    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save(@RequestBody EtudiantResource e) throws ParseException {
        etudiantService.save(e);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public void delete(@RequestBody EtudiantResource e) throws ParseException {
        etudiantService.delete(e);
    }
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<EtudiantResource> findAll(){
        return etudiantService.findAll();
    }
}
