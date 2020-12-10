/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.africapoticalconflicts;

import java.util.List;
import java.util.stream.Collectors;
import tn.esprit.africapoticalconflicts.model.Conflict;

/**
 *
 * @author psn
 */
public class ConflictsQueries {
    
    private final String[] event_types = {"battles","riots","explosions/remote violence"}; 

    public ConflictsQueries() {
    }
    
    
    // How many  violent events by country?
    public List<Conflict> AllViolentEventsByCountry(List<Conflict> list, String country){
        return list
                .stream()
                .filter( e -> e.getCountry().equalsIgnoreCase(country))
                .filter( e -> e.isViolent())
                .collect(Collectors.toList());
    }
    
    // How many violent events by region?
    public List<Conflict> AllViolentEventsByRegion(List<Conflict> list, String region){
        return null;
    }
    
    // Whats the most participating actor in violent events by countries?
    public List<Conflict> MostViolentActorByCountry(List<Conflict> list, String country){
        return null;
    }
    
    // Whats the most participating actor in Violent/Armed events by Region?
    public List<Conflict> MostViolentActorByRegion(List<Conflict> list, String region){
        return null;
    }
    
    // How many peacefull protests in by region?
    public List<Conflict> AllPeacefulProtestsByRegion(List<Conflict> list, String region){
        return null;
    }
    
    //How many peaceful protests by country?
    public List<Conflict> AllPeacefulProtestsByCountry(List<Conflict> list, String country){
        return null;
    }
    
    // How many fatalities by year in region?
    public List<Conflict> CountFatalitiesByYearAndRegion(List<Conflict> list, String region){
        return null;
    }
    
    // How many fataliries by year in country?
    public List<Conflict> CountFatalitiesByYearAndCountry(List<Conflict> list, String country){
        return null;
    }
    
    // Where were the most fatalties so far?
    
    // Who is the most active group in participating in violent events?
    
    // Most fatalties event by country XX?
    
    // Top sources by country
    
    // Number of battles in Africa and top countries
    
}
