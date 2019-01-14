package com.shelter.arvacska.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Allatka {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long allatkaID;
  Faj faj;
  String nev;
  int kor;
  List<KepUrl> kepek;
  String bemutatas;

  public Allatka(String nev) {
    this.nev = nev;
  }

  public Faj getFaj() {
    return faj;
  }

  public void setFaj(Faj faj) {
    this.faj = faj;
  }

  public String getNev() {
    return nev;
  }

  public void setNev(String nev) {
    this.nev = nev;
  }

  public int getKor() {
    return kor;
  }

  public List<KepUrl> getKepek() {
    return kepek;
  }

  public void setKepek(List<KepUrl> kepek) {
    this.kepek = kepek;
  }

  public String getBemutatas() {
    return bemutatas;
  }

  public void setBemutatas(String bemutatas) {
    this.bemutatas = bemutatas;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }
}
