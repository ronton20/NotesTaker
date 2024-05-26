package com.ronariel.notesrecorder;

import java.time.LocalDateTime;

public class Note {
    private int id;
    private String title;
    private String description;
    private String image;
    private LocalDateTime reminderDateTime;

    // ID
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // Description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // Image
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    // ReminderDateTime
    public LocalDateTime getReminderDateTime() { return reminderDateTime; }
    public void setReminderDateTime(LocalDateTime reminderDateTime) { this.reminderDateTime = reminderDateTime; }
}
