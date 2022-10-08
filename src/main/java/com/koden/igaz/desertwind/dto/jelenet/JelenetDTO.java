package com.koden.igaz.desertwind.dto.jelenet;

import java.util.List;

public class JelenetDTO {
    public int id;
    public String szoveg;
    public SearchDTO search;
    public WaitDTO wait;
    public List<String> invalidDirs;
    public String invalidDirsText;
    public List<ValidDirsDTO> validDirs;
    public String visitedSzoveg;

    public JelenetDTO() {
    }


    public int getId() {
        return this.id;
    }

    public String getSzoveg() {
        return this.szoveg;
    }

    public SearchDTO getSearch() {
        return this.search;
    }

    public WaitDTO getWait() {
        return this.wait;
    }

    public List<String> getInvalidDirs() {
        return this.invalidDirs;
    }

    public String getInvalidDirsText() {
        return this.invalidDirsText;
    }

    public List<ValidDirsDTO> getValidDirs() {
        return this.validDirs;
    }

    public String getVisitedSzoveg() {
        return this.visitedSzoveg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public void setSearch(SearchDTO search) {
        this.search = search;
    }

    public void setWait(WaitDTO wait) {
        this.wait = wait;
    }

    public void setInvalidDirs(List<String> invalidDirs) {
        this.invalidDirs = invalidDirs;
    }

    public void setInvalidDirsText(String invalidDirsText) {
        this.invalidDirsText = invalidDirsText;
    }

    public void setValidDirs(List<ValidDirsDTO> validDirs) {
        this.validDirs = validDirs;
    }

    public void setVisitedSzoveg(String visitedSzoveg) {
        this.visitedSzoveg = visitedSzoveg;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof JelenetDTO)) return false;
        final JelenetDTO other = (JelenetDTO) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$szoveg = this.getSzoveg();
        final Object other$szoveg = other.getSzoveg();
        if (this$szoveg == null ? other$szoveg != null : !this$szoveg.equals(other$szoveg)) return false;
        final Object this$search = this.getSearch();
        final Object other$search = other.getSearch();
        if (this$search == null ? other$search != null : !this$search.equals(other$search)) return false;
        final Object this$wait = this.getWait();
        final Object other$wait = other.getWait();
        if (this$wait == null ? other$wait != null : !this$wait.equals(other$wait)) return false;
        final Object this$invalidDirs = this.getInvalidDirs();
        final Object other$invalidDirs = other.getInvalidDirs();
        if (this$invalidDirs == null ? other$invalidDirs != null : !this$invalidDirs.equals(other$invalidDirs))
            return false;
        final Object this$invalidDirsText = this.getInvalidDirsText();
        final Object other$invalidDirsText = other.getInvalidDirsText();
        if (this$invalidDirsText == null ? other$invalidDirsText != null : !this$invalidDirsText.equals(other$invalidDirsText))
            return false;
        final Object this$validDirs = this.getValidDirs();
        final Object other$validDirs = other.getValidDirs();
        if (this$validDirs == null ? other$validDirs != null : !this$validDirs.equals(other$validDirs)) return false;
        final Object this$visitedSzoveg = this.getVisitedSzoveg();
        final Object other$visitedSzoveg = other.getVisitedSzoveg();
        if (this$visitedSzoveg == null ? other$visitedSzoveg != null : !this$visitedSzoveg.equals(other$visitedSzoveg))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof JelenetDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $szoveg = this.getSzoveg();
        result = result * PRIME + ($szoveg == null ? 43 : $szoveg.hashCode());
        final Object $search = this.getSearch();
        result = result * PRIME + ($search == null ? 43 : $search.hashCode());
        final Object $wait = this.getWait();
        result = result * PRIME + ($wait == null ? 43 : $wait.hashCode());
        final Object $invalidDirs = this.getInvalidDirs();
        result = result * PRIME + ($invalidDirs == null ? 43 : $invalidDirs.hashCode());
        final Object $invalidDirsText = this.getInvalidDirsText();
        result = result * PRIME + ($invalidDirsText == null ? 43 : $invalidDirsText.hashCode());
        final Object $validDirs = this.getValidDirs();
        result = result * PRIME + ($validDirs == null ? 43 : $validDirs.hashCode());
        final Object $visitedSzoveg = this.getVisitedSzoveg();
        result = result * PRIME + ($visitedSzoveg == null ? 43 : $visitedSzoveg.hashCode());
        return result;
    }

    public String toString() {
        return "JelenetDTO(id=" + this.getId() + ", szoveg=" + this.getSzoveg() + ", search=" + this.getSearch() + ", wait=" + this.getWait() + ", invalidDirs=" + this.getInvalidDirs() + ", invalidDirsText=" + this.getInvalidDirsText() + ", validDirs=" + this.getValidDirs() + ", visitedSzoveg=" + this.getVisitedSzoveg() + ")";
    }
}
