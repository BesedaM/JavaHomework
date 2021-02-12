package by.epam.learn.automation.maintask;

import by.epam.learn.automation.maintask.model.entity.Disk;
import by.epam.learn.automation.maintask.model.exception.ProjectException;
import by.epam.learn.automation.maintask.model.logic.MusicDuration;
import by.epam.learn.automation.maintask.model.logic.MusicFinder;
import by.epam.learn.automation.maintask.model.logic.MusicSorter;
import by.epam.learn.automation.maintask.model.util.ConsolePrinter;
import by.epam.learn.automation.maintask.model.util.DiskCreator;
import by.epam.learn.automation.maintask.model.util.DiskRecorder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ConsolePrinter.printTextLine("Let's create a disk and fill it with some music...");
        Disk disk = DiskCreator.createDisk(Disk.Type.MP3);
        try {
            DiskRecorder.fillDisk(disk);
            ConsolePrinter.printTextLine("Total disk size is " + disk.size() + " Mb");
            ConsolePrinter.printTextLine("Free space on disk - " + disk.freeSpace() + " Mb");
            ConsolePrinter.printTextLine("Music on disk: ");
            ConsolePrinter.printTextLine(disk.toString());
            ConsolePrinter.printTextLine("The total length of music on disk is " + MusicDuration.getMusicDuration(disk) + " s");
            ConsolePrinter.printTextLine("Sort the audio files according to their music style");
            MusicSorter.sortMusicByGenre(disk);
            ConsolePrinter.printTextLine("Disk with sorted audio by style: ");
            ConsolePrinter.printTextLine(disk.toString());
            ConsolePrinter.printTextLine("Let's find the music with audio length from 4 till 5 minutes: ");
            ConsolePrinter.printTextLine(Arrays.toString(
                    MusicFinder.findMusicByTrackLength(disk, 4 * 60, 5 * 60).toArray()));
        } catch (ProjectException e) {
            e.printStackTrace();
        }

    }
}
