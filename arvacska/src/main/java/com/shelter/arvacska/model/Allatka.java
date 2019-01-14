package com.shelter.arvacska.model;

import java.util.List;

public class Allatka {
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
