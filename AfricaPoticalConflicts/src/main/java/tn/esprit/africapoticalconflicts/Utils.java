/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.africapoticalconflicts;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import tn.esprit.africapoticalconflicts.model.Country;

/**
 *
 * @author psn
 */
public class Utils {

    public Utils() {
    }
    
    public Country iso_to_country(String iso) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/iso3166-countrycodes.txt";
        
        List<Country> list = Files.readAllLines(Paths.get(filePath))
                .stream()
                .skip(11)
                .map(line -> {
                    String[] attr = line
                            .replaceAll("\\w+\\s\\w+", "-")
                            .replaceAll("\\s+", ",")
                            .split(",");
                    return new Country(attr);
                })
                .collect(Collectors.toList());
                
        System.out.println(list);
        return null;   
    }
    
}
