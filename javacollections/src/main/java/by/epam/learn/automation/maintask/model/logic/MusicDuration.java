package by.epam.learn.automation.maintask.model.logic;

import by.epam.learn.automation.maintask.model.entity.Disk;

public class MusicDuration {

    /**
     * Finds the total duration of music on disk in seconds
     *
     * @param disk music source
     * @return total music duration on disk
     */
    public static int getMusicDuration(Disk disk) {
        int musicDuration = 0;
        if (disk != null && disk.audioAmount() > 0) {
            for (int i = 0; i < disk.audioAmount(); i++) {
                musicDuration += disk.getAudio(i).getDuration();
            }
        }
        return musicDuration;
    }
}
