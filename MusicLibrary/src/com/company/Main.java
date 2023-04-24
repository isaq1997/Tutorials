package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Song>song=new ArrayList<>();

        song.add(new Song("Heyy","Rock"));
        song.add(new Song("Heyy1","Rock"));
        ArrayList<MusicLibrary>mus =new ArrayList<>();
        mus.add(new MusicLibrary("Sonne",song));
        mus.add(new MusicLibrary("Sonne1",song));
        mus.add(new MusicLibrary("Sonne2",song));
        mus.add(new MusicLibrary("Sonne3",song));
        mus.get(0).addSong(song.get(1));


        System.out.println(mus.get(0).getList_song().get(0));

    }
}
