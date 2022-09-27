package com.koden.igaz.desertwind.dto.jelenet;

public class WaitDTO {
    public String szoveg;
    public boolean isDead;
    public int goToJelent;

    public WaitDTO() {
    }

    public String getSzoveg() {
        return this.szoveg;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public int getGoToJelent() {
        return this.goToJelent;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public void setGoToJelent(int goToJelent) {
        this.goToJelent = goToJelent;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WaitDTO)) return false;
        final WaitDTO other = (WaitDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$szoveg = this.getSzoveg();
        final Object other$szoveg = other.getSzoveg();
        if (this$szoveg == null ? other$szoveg != null : !this$szoveg.equals(other$szoveg)) return false;
        if (this.isDead() != other.isDead()) return false;
        if (this.getGoToJelent() != other.getGoToJelent()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WaitDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $szoveg = this.getSzoveg();
        result = result * PRIME + ($szoveg == null ? 43 : $szoveg.hashCode());
        result = result * PRIME + (this.isDead() ? 79 : 97);
        result = result * PRIME + this.getGoToJelent();
        return result;
    }

    public String toString() {
        return "WaitDTO(szoveg=" + this.getSzoveg() + ", isDead=" + this.isDead() + ", goToJelent=" + this.getGoToJelent() + ")";
    }
}
