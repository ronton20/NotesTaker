package com.ronariel.notesrecorder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class NoteAddingActivity extends AppCompatActivity {
    private EditText titleEditText;
    private EditText descriptionEditText;
    private ImageButton recordButton;
    private DateTimePicker reminderDateTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_adding);

        // Initialize UI elements
        titleEditText = findViewById(R.id.titleEditText);
        descriptionEditText = findViewById(R.id.descriptionEditText);
        recordButton = findViewById(R.id.recordButton);
//        reminderDateTimePicker = findViewById(R.id.reminderDateTimePicker);

        // Set up record button
        recordButton.setOnClickListener(v -> {
            // Start voice recording session

        });

        // Set up save button
        Button saveButton = findViewById(R.id.add_note_button);
        saveButton.setOnClickListener(v -> {
            // Save note to database
        });
    }
}