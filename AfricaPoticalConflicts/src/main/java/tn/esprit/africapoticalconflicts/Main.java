/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.africapoticalconflicts;

import tn.esprit.africapoticalconflicts.model.Conflict;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author psn
 */
public class Main {

    
    private static Utils utils = new Utils();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        String filePath = System.getProperty("user.dir") + "/src/main/resources/data.csv";
        
        List<Conflict> list = Files.readAllLines(Paths.get(filePath))
                                         .stream()
                                         .map(line -> {
                                             String[] attributes = line
                                                     .replaceAll(",(?!(?:[^\"]*\"[^\"]*\")*[^\"]*$)", "")
                                                     .split(",");
                                             return new Conflict(attributes);
                                          })
                                         .collect(Collectors.toList());
        
        list.forEach(System.out::println);

               //utils.iso_to_country("12");
        

        
    }
    
    
    
}
