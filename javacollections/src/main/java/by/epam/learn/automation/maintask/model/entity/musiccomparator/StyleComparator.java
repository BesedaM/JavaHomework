package by.epam.learn.automation.maintask.model.entity.musiccomparator;

import by.epam.learn.automation.maintask.model.entity.Music;

import java.util.Comparator;

public class StyleComparator implements Comparator<Music> {

    @Override
    public int compare(Music o1, Music o2) {
        return o1.getStyle().name().compareTo(o2.getStyle().name());
    }
}
