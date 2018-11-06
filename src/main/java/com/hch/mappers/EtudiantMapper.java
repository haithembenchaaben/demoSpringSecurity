package com.hch.mappers;

import com.hch.entities.Etudiant;
import com.hch.resources.EtudiantResource;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by haithem.ben-chaaben on 06/11/2018.
 */
public class EtudiantMapper {

    public static Etudiant mapReourceToEntity(EtudiantResource resource) throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         Etudiant e=Etudiant.builder()
                .id(resource.getId())
                .nom(resource.getNom())
                .prenom(resource.getPrenom())
                .dateNaissance(df.parse(resource.getDateNaissance()))
                .build();
         return e;
    }
    public static EtudiantResource mapEntityToResource(Etudiant entity)  {

        EtudiantResource r=EtudiantResource
                .builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .prenom(entity.getPrenom())
                .dateNaissance(entity.getDateNaissance().toString())
                .build();
        return r;
    }

    public static List<EtudiantResource> mapEntitiesToResources(List<Etudiant> entities) {
        List<EtudiantResource> resources = new ArrayList<>();
        if (entities != null && !entities.isEmpty()) {
            resources.addAll(
                    entities.stream().map(model -> mapEntityToResource(model)).collect(Collectors.toList()));
        }
        return resources;
    }
}
