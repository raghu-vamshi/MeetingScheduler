package com.meetingscheduler.service;

import com.meetingscheduler.model.Meeting;
import com.meetingscheduler.model.Slot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements  BookingService{


    @Override
    public int bookMeeting(long bookerId, Slot slot) {

        return 0;
    }

    @Override
    public List<Meeting> getAllMeetings() {
        return List.of();
    }
}
