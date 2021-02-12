package by.epam.learn.automation.maintask.model.util;

import by.epam.learn.automation.maintask.model.entity.FolkMusic;
import by.epam.learn.automation.maintask.model.entity.Music;
import by.epam.learn.automation.maintask.model.entity.MusicComposition;
import by.epam.learn.automation.maintask.model.entity.Song;

import java.util.ArrayList;
import java.util.List;

class MusicData {

    private static List<Music> musicData = new ArrayList<>();

    static List<Music> getMusicData() {
        musicData.add(new Song("Frank Sinatra", "Lucky Be A Lady", (5 * 60 + 20), 1965, Music.MusicStyle.JAZZ));
        musicData.add(new Song("Frank Sinatra", "The good life", (2 * 60 + 30), 1962, Music.MusicStyle.JAZZ));
        musicData.add(new Song("Frank Sinatra", "My way", (4 * 60 + 35), 1968, Music.MusicStyle.JAZZ));
        musicData.add(new Song("John Lennon", "Imagine", (3 * 60), 1971, Music.MusicStyle.ROCK));
        musicData.add(new Song("John Lennon", "Mind Games", (4 * 60 + 15), 1973, Music.MusicStyle.ROCK));
        musicData.add(new Song("Britney Spears", "Toxic", (3 * 60 + 20), 2003, Music.MusicStyle.POP));
        musicData.add(new Song("Britney Spears", "Lucky", (3 * 60 + 25), 2000, Music.MusicStyle.POP));
        musicData.add(new Song("Rasmus", "In the shadows", (3 * 60 + 50), 2003, Music.MusicStyle.ROCK));
        musicData.add(new Song("Gorillaz", "Fell Good Inc.", (3 * 60 + 45), 2005, Music.MusicStyle.ROCK));
        musicData.add(new Song("Louis Armstrong", "What a Wonderful World", (2 * 60 + 25), 1967, Music.MusicStyle.JAZZ));
        musicData.add(new Song("Queen", "Bohemian Rhapsody", (5 * 60 + 55), 1975, Music.MusicStyle.ROCK));
        musicData.add(new Song("Michael Jackson", "Smooth Criminal", (4 * 60 + 20), 1987, Music.MusicStyle.POP));
        musicData.add(new Song("Michael Jackson", "Thriller", (6 * 60), 1982, Music.MusicStyle.POP));
        musicData.add(new Song("The Cranberries", "Zombie", (4 * 60 + 15), 1994, Music.MusicStyle.ROCK));
        musicData.add(new Song("Enigma", "Sadness", (4 * 60 + 20), 1990, Music.MusicStyle.ROCK));
        musicData.add(new Song("Enigma", "The Eyes Of Truth", (4 * 60 + 40), 1994, Music.MusicStyle.ROCK));
        musicData.add(new MusicComposition("Mozart", "Requiem", (60 * 60), 1800, Music.MusicStyle.CLASSIC));
        musicData.add(new MusicComposition("Mozart", "Le nozze di Figaro ossia la folle giornata", (60 * 60), 1786, Music.MusicStyle.CLASSIC));
        musicData.add(new MusicComposition("Mozart", "Eine kleine Nachtmusik", (16 * 60), 1787, Music.MusicStyle.CLASSIC));
        musicData.add(new MusicComposition("Beethoven", "Für Elise", (16 * 60), 1810, Music.MusicStyle.CLASSIC));
        musicData.add(new FolkMusic("Carol of the Bells", (2 * 60 + 25), 1919, "ukrainian"));
        return musicData;
    }
}
