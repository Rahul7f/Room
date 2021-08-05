package com.rsin.room.RoomDB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {
    @PrimaryKey (autoGenerate = true)
    int stuID;
    @ColumnInfo(name = "first_name")
    String stuFirstName;
    @ColumnInfo(name = "last_name")
    String stuLastName;
    @ColumnInfo(name = "Class_name")
    String stuClass;

    public Student( String stuFirstName, String stuLastName, String stuClass) {
        this.stuFirstName = stuFirstName;
        this.stuLastName = stuLastName;
        this.stuClass = stuClass;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public void setStuFirstName(String stuFirstName) {
        this.stuFirstName = stuFirstName;
    }

    public void setStuLastName(String stuLastName) {
        this.stuLastName = stuLastName;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public int getStuID() {
        return stuID;
    }

    public String getStuFirstName() {
        return stuFirstName;
    }

    public String getStuLastName() {
        return stuLastName;
    }

    public String getStuClass() {
        return stuClass;
    }
}
