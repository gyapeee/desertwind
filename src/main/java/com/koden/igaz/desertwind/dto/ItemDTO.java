package com.koden.igaz.desertwind.dto;

public class ItemDTO {
  private String name;
  private long gotoJelenetID;
  private String text;
  private boolean used;

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public long getGotoJelenetID() {
    return gotoJelenetID;
  }

  public void setGotoJelenetID(long value) {
    this.gotoJelenetID = value;
  }

  public String getText() {
    return text;
  }

  public void setText(String value) {
    this.text = value;
  }

  public boolean getUsed() {
    return used;
  }

  public void setUsed(boolean value) {
    this.used = value;
  }
}
