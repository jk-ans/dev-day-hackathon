package com.meetingtracker;

import java.util.List;

public class Meeting {
    private String name;
    private String goal;
    private String startTime; // e.g. 2025-05-23T14:00
    private String endTime;   // e.g. 2025-05-23T15:00
    private String description;
    private List<Attendee> attendees;

    public Meeting() {}

    public Meeting(String name, String goal, String startTime, String endTime, String description, List<Attendee> attendees) {
        this.name = name;
        this.goal = goal;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public long getDurationMinutes() {
        if (startTime == null || endTime == null) return 0;
        try {
            java.time.LocalDateTime start = java.time.LocalDateTime.parse(startTime);
            java.time.LocalDateTime end = java.time.LocalDateTime.parse(endTime);
            return java.time.Duration.between(start, end).toMinutes();
        } catch (Exception e) {
            return 0;
        }
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
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", duration=" + getDurationMinutes() +
                ", description='" + description + '\'' +
                ", attendees=" + attendees +
                '}';
    }
}
