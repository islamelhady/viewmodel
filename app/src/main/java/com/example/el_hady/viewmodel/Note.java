package com.example.el_hady.viewmodel;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity (tableName = "note_table")
public class Note {

    @PrimaryKey (autoGenerate = true)
    private int id ;
    private String title;
    private String description;
    private String priotity;

    public Note(String title, String description, String priotity) {
        this.title = title;
        this.description = description;
        this.priotity = priotity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriotity() {
        return priotity;
    }
}
