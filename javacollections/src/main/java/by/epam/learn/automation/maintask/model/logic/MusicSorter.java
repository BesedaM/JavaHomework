package by.epam.learn.automation.maintask.model.logic;

import by.epam.learn.automation.maintask.model.entity.Disk;
import by.epam.learn.automation.maintask.model.entity.musiccomparator.StyleComparator;
import by.epam.learn.automation.maintask.model.entity.Music;

import java.util.List;

/**
 * Class created to implement sorting on disk
 */
public class MusicSorter {

    /**
     * Sorts music by genre
     *
     * @param disk music container
     */
    public static void sortMusicByGenre(Disk disk) {
        if (disk != null) {
            List<Music> musicList = disk.getMusicList();
            musicList.sort(new StyleComparator());
        }
    }
}
