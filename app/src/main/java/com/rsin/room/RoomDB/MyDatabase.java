package com.rsin.room.RoomDB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1)
public abstract class MyDatabase extends RoomDatabase {

  public abstract Dao dao();
}
