package by.epam.learn.automation.maintask.model.entity;

import java.util.Objects;

public class FolkMusic extends Music {

    private String nation;

    public FolkMusic() {
    }

    public FolkMusic(String name, int duration, int year, String nation) {
        super(name, duration, year, MusicStyle.FOLK);
        this.nation = nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNation() {
        return nation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FolkMusic)) return false;
        if (!super.equals(o)) return false;
        FolkMusic folkMusic = (FolkMusic) o;
        return nation.equals(folkMusic.nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nation);
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator();
    }
}
