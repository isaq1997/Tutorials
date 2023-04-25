package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Song>song=new ArrayList<>();

        song.add(new Song("Hayway","Rock"));
        song.add(new Song("Gluck","Rock"));
        ArrayList<MusicLibrary>mus =new ArrayList<>();
        mus.add(new MusicLibrary("Library_1",song));

        mus.get(0).addSong(song.get(1));


        System.out.println(song.get(0).getGenre());

    }
}
