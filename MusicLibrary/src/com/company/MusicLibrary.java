package com.company;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private String title;
    private ArrayList<Song>list_song;
    private ArrayList<String>songs=new ArrayList<>();
    public MusicLibrary(String title, ArrayList<Song> list_song) {
        this.title = title;
        this.list_song = list_song;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getList_song() {

        for(int i=0;i< list_song.size() ;i++){
            songs.add(list_song.get(i).getTitle());
        }
        return songs;
    }

    public void setList_song(ArrayList<Song> list_song) {
        this.list_song = list_song;
    }
    public void addSong(Song song) {
       list_song.add(song);
    }
    public   String get_random_song(){
        // int x = (int) (Math.random() * (list_song.size()-1));;
        int a=(int) (Math.random() * (list_song.size()-1));
        return list_song.get(a).getTitle();

    }
}




