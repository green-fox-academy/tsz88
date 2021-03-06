package com.shelter.arvacska.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;

@Entity
public class Allatka {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "id")
  protected Long allatkaID;
  protected Faj faj;
  @Column(name = "nev")
  protected String nev;
  @Column(name = "kor")
  protected int kor;
  @Column(name = "bemutatas")
  protected String bemutatas;
  @Column(name = "kolyok")
  protected boolean ezEgyKolyokAllatkaVajon;

  public Allatka(String nev) {
    this.nev = nev;
  }

  public Allatka(Faj faj, String nev, int kor, List<KepUrl> kepek, String bemutatas, boolean ezEgyKolyokAllatkaVajon) {
    this.faj = faj;
    this.nev = nev;
    this.kor = kor;
    this.bemutatas = bemutatas;
    this.ezEgyKolyokAllatkaVajon = ezEgyKolyokAllatkaVajon;
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

  public String getBemutatas() {
    return bemutatas;
  }

  public void setBemutatas(String bemutatas) {
    this.bemutatas = bemutatas;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public boolean isEzEgyKolyokAllatkaVajon() {
    return ezEgyKolyokAllatkaVajon;
  }

  public void setEzEgyKolyokAllatkaVajon(boolean ezEgyKolyokAllatkaVajon) {
    this.ezEgyKolyokAllatkaVajon = ezEgyKolyokAllatkaVajon;
  }

  public Long getAllatkaID() {
    return allatkaID;
  }
}
