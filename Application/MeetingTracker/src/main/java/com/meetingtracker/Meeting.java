package com.meetingtracker;

import java.util.List;

public class Meeting {
    private String name;
    private String goal;
    private int duration; // Duration in minutes
    private String description;
    private List<Attendee> attendees;

    public Meeting() {}

    public Meeting(String name, String goal, int duration, String description, List<Attendee> attendees) {
        this.name = name;
        this.goal = goal;
        this.duration = duration;
        this.description = description;
        this.attendees = attendees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "name='" + name + '\'' +
                ", goal='" + goal + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", attendees=" + attendees +
                '}';
    }
}
