package com.koden.igaz.desertwind.dto.jelenet;

public class ValidDirsDTO {
  public String name;
  public int goToJelenet;

  public ValidDirsDTO() {
    // this is a DTO so no need to add code here
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
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
    if (!(o instanceof ValidDirsDTO)) {
      return false;
    }
    final ValidDirsDTO other = (ValidDirsDTO) o;
    if (!other.canEqual(this)) {
      return false;
    }
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
      return false;
    }
    return this.getGoToJelenet() == other.getGoToJelenet();
  }

  protected boolean canEqual(final Object other) {
    return other instanceof ValidDirsDTO;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    result = result * PRIME + this.getGoToJelenet();
    return result;
  }

  public String toString() {
    return "ValidDirsDTO(name=" + this.getName() + ", goToJelent=" + this.getGoToJelenet() + ")";
  }
}
