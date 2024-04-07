package com.meetingscheduler.inventory;

import com.meetingscheduler.model.Meeting;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MeetingInventory {

    private Map<Long, Meeting> meetingMap=new HashMap<>();

    public Meeting getMeetingById(long id){
        return meetingMap.get(id);
    }

    public void addNewMeeting(Meeting meeting){
        meeting.setId(meetingMap.size()+1);
        meetingMap.put(meeting.getId(), meeting);
    }
}
