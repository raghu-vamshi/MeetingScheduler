package com.meetingscheduler.service;

import com.meetingscheduler.model.Meeting;
import com.meetingscheduler.model.Slot;

import java.util.List;

public interface BookingService {

    int bookMeeting(long bookerId, Slot slot);

    List<Meeting> getAllMeetings();
}
