package com.example.emptyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CourseListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
    }
    ListView courseListView = findViewById(R.id.course_list_view);
    CourseListAdapter adapter = new CourseListAdapter(this, courses); // Assuming 'courses' is a list of Course objects
courseListView.setAdapter(adapter);
}