package by.epam.learn.automation.maintask.model.logic;

import by.epam.learn.automation.maintask.model.entity.Disk;
import by.epam.learn.automation.maintask.model.entity.Music;

import java.util.ArrayList;
import java.util.List;


public class MusicFinder {

    /**
     * Finds music on disk by the given duration range
     *
     * @param disk      music source
     * @param minLength minimum length of audio
     * @param maxLength maximum length of audio
     * @return list of music with the audio duration in the range from {@param minLength} to {@param maxLength}
     */
    public static List<Music> findMusicByTrackLength(Disk disk, int minLength, int maxLength) {
        List<Music> musicList = new ArrayList<>();
        if (disk != null && disk.audioAmount() > 0
                && minLength > 0 && maxLength > minLength) {
            for (int i = 0; i < disk.audioAmount(); i++) {
                Music track = disk.getAudio(i);
                if (track.getDuration() >= minLength
                        && track.getDuration() <= maxLength) {
                    musicList.add(track);
                }
            }
        }
        return musicList;
    }
}
