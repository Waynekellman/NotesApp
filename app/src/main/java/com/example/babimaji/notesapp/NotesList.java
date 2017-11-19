package com.example.babimaji.notesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.zip.Inflater;

/**
 * Created by BabiMaji on 11/1/17.
 */

public class NotesList extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.noteslistmenu, menu);//This is how you inflate a menu!
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_note_button:
                Intent intent = new Intent(this, NoteDetail.class);
                startActivity(intent);
        }
        return true;
    }

    public void viewNote(){

        //needs to launch the note detail activity in view mode.

    }

    public void launchEditNote(){
        //opens the note detail in edit mode
    }

    public void deleteNote(){
        //deletes the notes
    }

    public void archiveNote(){
        //stores the notes into an archive.
    }
}
