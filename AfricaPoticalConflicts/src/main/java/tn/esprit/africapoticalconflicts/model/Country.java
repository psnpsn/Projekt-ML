/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.africapoticalconflicts.model;

/**
 *
 * @author psn
 */
public class Country {
    
    private String name;
    private String ISO_A2;
    private String ISO_A3;
    private String ISO_Number;

    public Country() {
    }

    public Country(String[] s) {
        this.name = s[0];
        this.ISO_A2 = s[1];
        this.ISO_A3 = s[2];
        this.ISO_Number = s[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISO_A2() {
        return ISO_A2;
    }

    public void setISO_A2(String ISO_A2) {
        this.ISO_A2 = ISO_A2;
    }

    public String getISO_A3() {
        return ISO_A3;
    }

    public void setISO_A3(String ISO_A3) {
        this.ISO_A3 = ISO_A3;
    }

    public String getISO_Number() {
        return ISO_Number;
    }

    public void setISO_Number(String ISO_Number) {
        this.ISO_Number = ISO_Number;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", ISO_A2=" + ISO_A2 + ", ISO_A3=" + ISO_A3 + ", ISO_Number=" + ISO_Number + '}';
    }
    
    
    
}
