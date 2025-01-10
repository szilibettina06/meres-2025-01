/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalapacsvetes;

public class Sportolo {

    private Integer Helyezes;
    private Integer Eredmeny;
    private String Sportolo;
    private String Orszagkod;
    private String Helyszin;
    private Integer Datum;

    //constructor
    public Sportolo(Integer Helyezes, Integer Eredmeny, String Sportolo, String Orszagkod, String Helyszin, Integer Datum) {
        this.Helyezes = Helyezes;
        this.Eredmeny = Eredmeny;
        this.Sportolo = Sportolo;
        this.Orszagkod = Orszagkod;
        this.Helyszin = Helyszin;
        this.Datum = Datum;
    }

    //getterek
    public Integer getHelyezes() {
        return Helyezes;
    }

    public Integer getEredmeny() {
        return Eredmeny;
    }

    public String getSportolo() {
        return Sportolo;
    }

    public String getOrszagkod() {
        return Orszagkod;
    }

    public String getHelyszin() {
        return Helyszin;
    }

    public Integer getDatum() {
        return Datum;
    }

    //setterek
    public Integer setHelyezes() {
        return Helyezes;
    }

    public Integer setEredmeny() {
        return Eredmeny;
    }

    public String setSportolo() {
        return Sportolo;
    }

    public String setOrszagkod() {
        return Orszagkod;
    }

    public String setHelyszin() {
        return Helyszin;
    }

    public Integer setDatum() {
        return Datum;
    }
}
