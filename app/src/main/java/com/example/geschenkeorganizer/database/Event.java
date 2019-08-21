package com.example.geschenkeorganizer.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/** https://developer.android.com/training/data-storage/room/defining-data
 Index und unique
 glaub unique, weil 1 Zeile in DB genügt --> Zuordnung zu Personen über Join-Klasse, besser für Weihnachten etc*/
@Entity(indices = {@Index(value = {"eventName", "eventDate"},
        unique = true)})
public class Event {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int eventId;

    private String eventName;
    private long eventDate;

    // verschiedene Konstruktoren
    public Event(){}

    public Event(String eventName, String eventDate){}

    //getter
    @NonNull
    public int getEventId(){
        return eventId;
    }

    public String getEventName(){
        return eventName;
    }

    public long getEventDate(){
        return eventDate;
    }

    //setter
    public void setEventId(@NonNull int eventId){
        this.eventId = eventId;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public void setEventDate(Long eventDate){
        this.eventDate = eventDate;
    }
}
