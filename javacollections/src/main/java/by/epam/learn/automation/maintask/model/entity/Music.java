package by.epam.learn.automation.maintask.model.entity;

import java.util.Objects;

public class Music {
    private static int idCounter = 0;

    protected int id;
    protected String name;
    protected int duration;
    protected int year;
    protected MusicStyle genre;

    public enum MusicStyle {
        ROCK, BLUES, JAZZ, FOLK, CLASSIC, POP, INDIE, HYMN
    }

    {
        this.id = idCounter++;
    }

    public Music() {
    }

    public Music(String name, int duration, int year, MusicStyle genre) {
        this.name = name;
        this.duration = duration;
        this.year = year;
        this.genre = genre;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStyle(MusicStyle genre) {
        this.genre = genre;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public MusicStyle getStyle() {
        return genre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Music)) return false;
        Music music = (Music) o;
        return duration == music.duration &&
                name.equals(music.name) &&
                year == music.year &&
                genre == music.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, year, genre);
    }

    @Override
    public String toString() {
        return id + ". " + name +
                ", duration - " + duration / 60 + " min " + duration % 60 + " s, "
                + genre + ", " + year;
    }
}
