package by.epam.learn.automation.maintask.model.entity;

import java.util.Objects;

public class Song extends Music {

    private String singerName;

    public Song() {
    }

    public Song(String singerName, String name, int duration, int year, MusicStyle genre) {
        super(name, duration, year, genre);
        this.singerName = singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerName() {
        return singerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        if (!super.equals(o)) return false;
        Song song = (Song) o;
        return singerName.equals(song.singerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), singerName);
    }

    @Override
    public String toString() {
        return id + ". " + singerName + ". " + name +
                ", duration - " + duration / 60 + " min " + duration % 60 + " s, "
                + genre + ", " + year + System.lineSeparator();
    }
}
