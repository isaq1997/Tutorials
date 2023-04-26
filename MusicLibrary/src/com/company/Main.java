package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Song>song1=new ArrayList<>();
        song1.add(new Song("Truce","Folk"));
        ArrayList<Song>song=new ArrayList<>();

        song.add(new Song("Hayway","Rock"));
        song.add(new Song("Gluck","Rock"));
        song.add(new Song("Teo","Rock"));
        ArrayList<MusicLibrary>mus =new ArrayList<>();
        mus.add(new MusicLibrary("Library_1",song));
        mus.get(0).addSong(song1.get(0));
        System.out.println(mus.get(0).getList_song());
        System.out.println(mus.get(0).getTitle()+"--->"+song.get(2).getTitle());
        System.out.println(mus.get(0).get_random_song());

    }
}
