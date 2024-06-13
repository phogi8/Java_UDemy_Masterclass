package sec13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if (this.findSong(song.getTitle()) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int track) {
            if (track > 0 && track <= songs.size()) {
                return songs.get(track-1);
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        Song song = new Song(title, duration);
        return this.songs.add(song);
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList) {
        Song song = this.songs.findSong(track);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.printf("This album does not have a track %d%n", track);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = this.songs.findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.printf("The song %s is not in this album%n", title);
        return false;
    }
}
