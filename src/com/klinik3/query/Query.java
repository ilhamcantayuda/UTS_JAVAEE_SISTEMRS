/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.klinik3.query;

import com.klinik3.bean.Dokter;
import com.klinik3.bean.Pasien;
import com.klinik3.util.NewHibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import com.klinik3.bean.Obat;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author albi
 */
public class Query {
    
    public void tambahp(String Kdpasien, String Nmpasien, String jk, String up, String alamat, String tlp){

         Session session = NewHibernateUtil.getSessionFactory().openSession();
         try{

        Transaction transaction = session.getTransaction();
        transaction.begin();
        Pasien pasien = new Pasien();
        pasien.setKdPasien(Kdpasien);
        pasien.setNmPasien(Nmpasien);
        pasien.setJeniskelamin(jk);
        pasien.setUp(up);
        pasien.setAlamat(alamat);
        pasien.setTlp(tlp);
        session.save(pasien);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
    }
    
public void hapusp(String kdpasien){
  Session session = NewHibernateUtil.getSessionFactory().openSession();
    try{
   
Transaction transaction = session.getTransaction();
        transaction.begin();
        Pasien pasien =  (Pasien) session.get(Pasien.class, new String(kdpasien));
        session.delete(pasien);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
}
public void ubahp(String kd, String nm, String jk, String up, String alamat, String tlp){
    Session session = NewHibernateUtil.getSessionFactory().openSession();
try{
    
Transaction transaction = session.getTransaction();
        transaction.begin();
        Pasien pasien = new Pasien();
       pasien.setKdPasien(kd);
       pasien.setNmPasien(nm);
       pasien.setJeniskelamin(jk);
       pasien.setUp(up);
       pasien.setAlamat(alamat);
       pasien.setTlp(tlp);
        session.update(pasien);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
}

public void tambahd(String Kddokter, String Nmdokter, String jk, String sep, String alamat, String tlp, String pass){

         Session session = NewHibernateUtil.getSessionFactory().openSession();
         try{

        Transaction transaction = session.getTransaction();
        transaction.begin();
        Dokter dokter= new Dokter();
        dokter.setKdDokter(Kddokter);
        dokter.setNmDokter(Nmdokter);
        dokter.setJeniskelamin(jk);
        dokter.setSpecialist(sep);
        dokter.setAlamat(alamat);
        dokter.setTlp(tlp);
        dokter.setPassword(pass);
        session.save(dokter);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
    }
    
public void hapusd(String kddokter){
  Session session = NewHibernateUtil.getSessionFactory().openSession();
    try{
   
Transaction transaction = session.getTransaction();
        transaction.begin();
        Dokter dokter =  (Dokter) session.get(Dokter.class, new String(kddokter));
        session.delete(dokter);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
}
public void ubahd(String Kddokter, String Nmdokter, String jk, String sep, String alamat, String tlp, String pass){
    Session session = NewHibernateUtil.getSessionFactory().openSession();
try{
    
Transaction transaction = session.getTransaction();
        transaction.begin();
      Dokter dokter= new Dokter();
        dokter.setKdDokter(Kddokter);
        dokter.setNmDokter(Nmdokter);
        dokter.setJeniskelamin(alamat);
        dokter.setSpecialist(sep);
        dokter.setAlamat(alamat);
        dokter.setTlp(tlp);
        dokter.setPassword(pass);
        session.update(dokter);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
}

public void tambaho(String Kdobat, String Nmobat, String jo, String tgl, String Harga){

         Session session = NewHibernateUtil.getSessionFactory().openSession();
         try{

        Transaction transaction = session.getTransaction();
        transaction.begin();
        Obat obat = new Obat();
        obat.setKdObat(Kdobat);
        obat.setNmObat(Nmobat);
        obat.setJenisobat(jo);
        obat.setTglkadaluarsa(tgl);
        obat.setHarga(Harga);
        session.save(obat);// save ke database
        transaction.commit();
}catch (Exception E){
    }finally {
         session.close(); 
      }
}
public void hapuso(String kdo){
  Session session = NewHibernateUtil.getSessionFactory().openSession();
    try{
   
Transaction transaction = session.getTransaction();
        transaction.begin();
        Obat obat =  (Obat) session.get(Obat.class, new String(kdo));
        session.delete(obat);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
}
public void ubaho(String Kdobat, String Nmobat, String jo, String tgl, String Harga){
    Session session = NewHibernateUtil.getSessionFactory().openSession();
try{
    
Transaction transaction = session.getTransaction();
        transaction.begin();
        Obat obat = new Obat();
        obat.setKdObat(Kdobat);
        obat.setNmObat(Nmobat);
        obat.setJenisobat(jo);
        obat.setTglkadaluarsa(tgl);
        obat.setHarga(Harga);
        session.update(obat);// save ke database
        transaction.commit();
}catch (Exception E){}
finally {
         session.close(); 
      }
}
}
