package com.koden.igaz.desertwind.dto.jelenet;

import com.koden.igaz.desertwind.dto.UseItemDTO;

import java.util.List;
import java.util.Objects;

public class JelenetDTO {
  public int id;
  public String szoveg;
  public SearchDTO search;
  public WaitDTO wait;
  public List<String> invalidDirs;
  public String invalidDirsText;
  public List<ValidDirsDTO> validDirs;
  public String visitedSzoveg;
  private UseItemDTO useItem;

  public JelenetDTO() {
  }


  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSzoveg() {
    return this.szoveg;
  }

  public void setSzoveg(String szoveg) {
    this.szoveg = szoveg;
  }

  public SearchDTO getSearch() {
    return this.search;
  }

  public void setSearch(SearchDTO search) {
    this.search = search;
  }

  public WaitDTO getWait() {
    return this.wait;
  }

  public void setWait(WaitDTO wait) {
    this.wait = wait;
  }

  public List<String> getInvalidDirs() {
    return this.invalidDirs;
  }

  public void setInvalidDirs(List<String> invalidDirs) {
    this.invalidDirs = invalidDirs;
  }

  public String getInvalidDirsText() {
    return this.invalidDirsText;
  }

  public void setInvalidDirsText(String invalidDirsText) {
    this.invalidDirsText = invalidDirsText;
  }

  public List<ValidDirsDTO> getValidDirs() {
    return this.validDirs;
  }

  public void setValidDirs(List<ValidDirsDTO> validDirs) {
    this.validDirs = validDirs;
  }

  public String getVisitedSzoveg() {
    return this.visitedSzoveg;
  }

  public void setVisitedSzoveg(String visitedSzoveg) {
    this.visitedSzoveg = visitedSzoveg;
  }

  public UseItemDTO getUseItem() {
    return useItem;
  }

  public void setUseItem(UseItemDTO value) {
    this.useItem = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JelenetDTO that = (JelenetDTO) o;
    return id == that.id && Objects.equals(szoveg, that.szoveg) && Objects.equals(search, that.search) &&
           Objects.equals(wait, that.wait) && Objects.equals(invalidDirs, that.invalidDirs) &&
           Objects.equals(invalidDirsText, that.invalidDirsText) && Objects.equals(validDirs, that.validDirs) &&
           Objects.equals(visitedSzoveg, that.visitedSzoveg) && Objects.equals(useItem, that.useItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, szoveg, search, wait, invalidDirs, invalidDirsText, validDirs, visitedSzoveg, useItem);
  }

  @Override
  public String toString() {
    return "JelenetDTO{" + "id=" + id + ", szoveg='" + szoveg + '\'' + ", search=" + search + ", wait=" + wait +
           ", invalidDirs=" + invalidDirs + ", invalidDirsText='" + invalidDirsText + '\'' + ", validDirs=" +
           validDirs + ", visitedSzoveg='" + visitedSzoveg + '\'' + ", useItem=" + useItem + '}';
  }
}
