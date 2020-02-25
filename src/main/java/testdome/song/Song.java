package testdome.song;

import java.util.*;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Set<Song> songsSet = new HashSet<>();

        Song nextSong = this.nextSong;

        while(nextSong != null) {
            if (!songsSet.add(nextSong)) {
                return true;
            }

            nextSong = nextSong.nextSong;
        }

        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
