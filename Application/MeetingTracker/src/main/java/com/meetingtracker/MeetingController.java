package com.meetingtracker;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/meetings")
public class MeetingController {
    private final List<Meeting> meetings = new ArrayList<>();

    @GetMapping
    public List<Meeting> getAllMeetings() {
        return meetings;
    }

    @PostMapping
    public Meeting createMeeting(@RequestBody Meeting meeting) {
        if (meeting.getAttendees() == null) {
            meeting.setAttendees(new ArrayList<>());
        }
        meetings.add(meeting);
        return meeting;
    }
}
