package com.hch.dao;

import com.hch.entities.Etudiant;
import com.hch.exception.DataNotFoundException;
import com.hch.exception.ParseDateException;
import com.hch.exception.SaveDataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
@Repository
public class EtudiantDaoImpl implements EtudiantDao {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public void save(Etudiant etudiant)  {

        try{

          etudiantRepository.save(etudiant);
      } catch(SaveDataException ex){
              throw new SaveDataException("Error when Saving Data");
      }
    }

    @Override
    public void delete(Etudiant etudiant) {
        try{
            etudiantRepository.delete(etudiant);
        } catch(DataNotFoundException ex){
            throw new DataNotFoundException("Error when Deleting Data");
        }
    }


    @Override
    public List<Etudiant> findAll() {

        Optional<List<Etudiant>> listEtudiant = Optional.of(this.etudiantRepository.findAll());
        return listEtudiant.get();
    }



//    @PostConstruct
//    public void savePostConstruct(){
//        Etudiant e1=Etudiant.builder().build();
//        Etudiant e2=Etudiant.builder().build();
//        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//        try {
//             e1=Etudiant.builder()
//                    .nom("Haithem")
//                    .prenom("Benchaaben")
//                    .dateNaissance(df.parse("1990-06-02"))
//                    .build();
//            e2=Etudiant.builder()
//                    .nom("Hamza")
//                    .prenom("Ouni")
//                    .dateNaissance(df.parse("1992-06-02"))
//                    .build();
//        } catch (ParseException e) {
//           System.out.println("Error when parsing Date");
//        }
//        etudiantRepository.save(e1);
//        etudiantRepository.save(e2);
//    }
}
