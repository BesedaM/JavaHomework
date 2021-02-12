package by.epam.learn.automation.maintask.model.util;

import by.epam.learn.automation.maintask.model.entity.Disk;
import by.epam.learn.automation.maintask.model.entity.Music;
import by.epam.learn.automation.maintask.model.exception.NotEnoughSpaceOnDiskException;

import java.util.List;

public class DiskRecorder {

    /**
     * Fills the disk with pre-organized data from {@link MusicData}
     *
     * @param disk container to fill
     * @throws NotEnoughSpaceOnDiskException if there is no space on disk
     */
    public static void fillDisk(Disk disk) throws NotEnoughSpaceOnDiskException {
        fillDisk(disk, MusicData.getMusicData());
    }


    /**
     * Fills the disk with some prepared data
     *
     * @param disk      container to fill
     * @param musicData collection of music
     * @throws NotEnoughSpaceOnDiskException if there is no space on disk
     */
    public static void fillDisk(Disk disk, List<Music> musicData) throws NotEnoughSpaceOnDiskException {
        if (disk != null && musicData != null) {
            for (Music audio : musicData) {
                disk.addAudio(audio);
            }
        }
    }

}
