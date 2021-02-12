package by.epam.learn.automation.maintask.model.util;

import by.epam.learn.automation.maintask.model.entity.Disk;

/**
 * Creates an empty disk of specified type
 */
public class DiskCreator {

    public static Disk createDisk(Disk.Type type) {
        return new Disk(type);
    }
}
