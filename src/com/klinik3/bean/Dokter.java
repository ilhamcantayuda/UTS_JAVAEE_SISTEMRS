package com.klinik3.bean;
// Generated Nov 12, 2016 12:57:37 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dokter generated by hbm2java
 */
public class Dokter  implements java.io.Serializable {


     private String kdDokter;
     private String nmDokter;
     private String jeniskelamin;
     private String specialist;
     private String alamat;
     private String tlp;
     private String password;
    

    public Dokter() {
    }

	
    public Dokter(String kdDokter, String nmDokter, String jeniskelamin, String specialist, String alamat, String tlp, String password) {
        this.kdDokter = kdDokter;
        this.nmDokter = nmDokter;
        this.jeniskelamin = jeniskelamin;
        this.specialist = specialist;
        this.alamat = alamat;
        this.tlp = tlp;
        this.password = password;
    }
    public Dokter(String kdDokter, String nmDokter, String jeniskelamin, String specialist, String alamat, String tlp, String password, Set reseps) {
       this.kdDokter = kdDokter;
       this.nmDokter = nmDokter;
       this.jeniskelamin = jeniskelamin;
       this.specialist = specialist;
       this.alamat = alamat;
       this.tlp = tlp;
       this.password = password;
      
    }
   
    public String getKdDokter() {
        return this.kdDokter;
    }
    
    public void setKdDokter(String kdDokter) {
        this.kdDokter = kdDokter;
    }
    public String getNmDokter() {
        return this.nmDokter;
    }
    
    public void setNmDokter(String nmDokter) {
        this.nmDokter = nmDokter;
    }
    public String getJeniskelamin() {
        return this.jeniskelamin;
    }
    
    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    public String getSpecialist() {
        return this.specialist;
    }
    
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getTlp() {
        return this.tlp;
    }
    
    public void setTlp(String tlp) {
        this.tlp = tlp;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
   
    
   




}


