package com.koden.igaz.desertwind.dto;

public class UseItemDTO {
  private String itemName;
  private String notUsedText;
  private String usedText;

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String value) {
    this.itemName = value;
  }

  public String getNotUsedText() {
    return notUsedText;
  }

  public void setNotUsedText(String value) {
    this.notUsedText = value;
  }

  public String getUsedText() {
    return usedText;
  }

  public void setUsedText(String value) {
    this.usedText = value;
  }
}
