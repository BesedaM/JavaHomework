package by.epam.learn.automation.maintask.model.entity;

import java.util.Objects;

public class MusicComposition extends Music {
    private String authorName;

    public MusicComposition() {
    }

    public MusicComposition(String authorName, String name, int duration, int year, MusicStyle genre) {
        super(name, duration, year, genre);
        this.authorName = authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicComposition)) return false;
        if (!super.equals(o)) return false;
        MusicComposition that = (MusicComposition) o;
        return authorName.equals(that.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), authorName);
    }

    @Override
    public String toString() {
        return id + ". " + authorName + ". " + name +
                ", duration - " + duration / 60 + " min " + duration % 60 +" s, "
                + genre + ", " + year + System.lineSeparator();
    }
}
