package com.example.babimaji.notesapp;

/**
 * Created by BabiMaji on 11/1/17.
 */

public interface NoteManager {
    boolean addNote(String title, String body);
    boolean updateNote(int noteId, String title, String body);

}
