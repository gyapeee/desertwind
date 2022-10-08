package com.koden.igaz.desertwind.dto.jelenet;

public class SearchDTO {
  public String szoveg;
  public String item;

  public SearchDTO() {
  }

  public String getSzoveg() {
    return this.szoveg;
  }

  public void setSzoveg(String szoveg) {
    this.szoveg = szoveg;
  }

  public String getItem() {
    return this.item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof SearchDTO)) {
      return false;
    }
    final SearchDTO other = (SearchDTO) o;
    if (!other.canEqual(this)) {
      return false;
    }
    final Object this$szoveg = this.getSzoveg();
    final Object other$szoveg = other.getSzoveg();
    if (this$szoveg == null ? other$szoveg != null : !this$szoveg.equals(other$szoveg)) {
      return false;
    }
    final Object this$item = this.getItem();
    final Object other$item = other.getItem();
    return this$item == null ? other$item == null : this$item.equals(other$item);
  }

  protected boolean canEqual(final Object other) {
    return other instanceof SearchDTO;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $szoveg = this.getSzoveg();
    result = result * PRIME + ($szoveg == null ? 43 : $szoveg.hashCode());
    final Object $item = this.getItem();
    result = result * PRIME + ($item == null ? 43 : $item.hashCode());
    return result;
  }

  public String toString() {
    return "SearchDTO(szoveg=" + this.getSzoveg() + ", item=" + this.getItem() + ")";
  }
}
