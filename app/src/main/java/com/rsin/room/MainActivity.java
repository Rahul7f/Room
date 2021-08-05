  package com.rsin.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rsin.room.RoomDB.MyDatabase;
import com.rsin.room.RoomDB.Student;

  public class MainActivity extends AppCompatActivity {
    EditText fname,sname,stdclass;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.fname);
        sname = findViewById(R.id.sname);
        stdclass = findViewById(R.id.std_class);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(fname.getText().toString(),sname.getText().toString(),stdclass.getText().toString());
                MyDatabase myDatabase = Room.databaseBuilder(MainActivity.this,MyDatabase.class,"StudentDB")
                        .allowMainThreadQueries().build();
                myDatabase.dao().studentInsertion(student);
            }
        });
    }
}