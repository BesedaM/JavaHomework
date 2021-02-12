package by.epam.learn.automation.maintask.model.entity;

import by.epam.learn.automation.maintask.model.exception.NotEnoughSpaceOnDiskException;

import java.util.ArrayList;
import java.util.List;

/**
 * Container class for music tracks
 */
public class Disk {

    private List<Music> musicList;
    private Type diskType;
    private double size;

    public enum Type {
        CD(DiskOption.CD_SIZE, DiskOption.CD_AUDIO_ONE_MINUTE_SIZE),
        MP3(DiskOption.MP3_SIZE, DiskOption.MP3_AUDIO_ONE_MINUTE_SIZE),
        DVD(DiskOption.DVD_SIZE, DiskOption.DVD_AUDIO_ONE_MINUTE_SIZE);
        private int size;
        private int oneMinuteSize;

        Type(int size, int oneMinuteSize) {
            this.size = size;
            this.oneMinuteSize = oneMinuteSize;
        }
    }

    public Disk(Type type) {
        diskType = type;
        size = type.size;
        musicList = new ArrayList<>();
    }

    /**
     * @return total amount of audio on the disk
     */
    public int audioAmount() {
        return musicList.size();
    }

    public Music getAudio(int index) {
        return musicList.get(index);
    }

    /**
     * @return size of disk in MegaByte
     */
    public int size() {
        return this.diskType.size;
    }

    /**
     * @return amount of free space on the disk in MegaByte
     */
    public int freeSpace() {
        return (int) this.size;
    }

    public Type getDiskType() {
        return diskType;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void addAudio(Music audio) throws NotEnoughSpaceOnDiskException {
        if (audio != null) {
            double audioSize = audio.duration / 60.0 * this.diskType.oneMinuteSize;
            if (audioSize < this.size) {
                this.size -= audioSize;
                musicList.add(audio);
            } else {
                throw new NotEnoughSpaceOnDiskException();
            }
        }
    }

    public boolean containsAudio(Music audio) {
        return musicList.contains(audio);
    }

    public void clearDisk() {
        this.size = diskType.size;
        musicList.clear();
    }


    @Override
    public String toString() {
        return "Disk " + musicList;
    }
}
