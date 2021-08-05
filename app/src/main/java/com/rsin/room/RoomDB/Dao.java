package com.rsin.room.RoomDB;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface Dao {

        @Insert
        public void studentInsertion(Student student);

        @Query("Select * from Student")
        List<Student> getstudent();

}
