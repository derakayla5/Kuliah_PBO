/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author ASUS
 */
public class Blackpink {
    // Properties
    public String memberName;
    public int debutYear;
    public String agency;

    // Constructor
    public Blackpink(String memberName, int debutYear, String agency) {
        this.memberName = memberName;
        this.debutYear = debutYear;
        this.agency = agency;
    }

    // Method untuk mendapatkan informasi Blackpink
    public String getInfo() {
        return "Nama Member: " + memberName + ", Tahun Debut: " + debutYear + ", Agensi: " + agency;
    }
}


