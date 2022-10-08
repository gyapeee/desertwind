package com.koden.igaz.desertwind.dto.jelenet;

public class WaitDTO {
  public String szoveg;
  public int goToJelenet;
  public boolean dead;

  public WaitDTO() {
    // this is a DTO so no need to add code here
  }

  public String getSzoveg() {
    return this.szoveg;
  }

  public void setSzoveg(String szoveg) {
    this.szoveg = szoveg;
  }

  public boolean dead() {
    return this.dead;
  }

  public void setDead(boolean dead) {
    this.dead = dead;
  }

  public int getGoToJelenet() {
    return this.goToJelenet;
  }

  public void setGoToJelenet(int goToJelenet) {
    this.goToJelenet = goToJelenet;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof WaitDTO)) {
      return false;
    }
    final WaitDTO other = (WaitDTO) o;
    if (!other.canEqual(this)) {
      return false;
    }
    final Object this$szoveg = this.getSzoveg();
    final Object other$szoveg = other.getSzoveg();
    if (this$szoveg == null ? other$szoveg != null : !this$szoveg.equals(other$szoveg)) {
      return false;
    }
    if (this.dead() != other.dead()) {
      return false;
    }
    return this.getGoToJelenet() == other.getGoToJelenet();
  }

  protected boolean canEqual(final Object other) {
    return other instanceof WaitDTO;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $szoveg = this.getSzoveg();
    result = result * PRIME + ($szoveg == null ? 43 : $szoveg.hashCode());
    result = result * PRIME + (this.dead() ? 79 : 97);
    result = result * PRIME + this.getGoToJelenet();
    return result;
  }

  public String toString() {
    return "WaitDTO(szoveg=" + this.getSzoveg() + ", dead=" + this.dead() + ", goToJelent=" + this.getGoToJelenet() +
           ")";
  }
}
