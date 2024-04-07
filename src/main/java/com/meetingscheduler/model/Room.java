package com.meetingscheduler.model;

import lombok.Value;

import java.util.HashMap;
import java.util.Map;
@Value
public class Room {

    int number;
    static Map<Slot, Long> calendar = new HashMap<>();

    public Room(int number) {
        this.number = number;
    }

    public void addMeetingToCalendar(Slot slot, long bookerId) {
        if (checkIfSlotIsEmpty(slot)) {
            calendar.put(slot, bookerId);
        }
    }

    public boolean checkIfSlotIsEmpty(Slot slot) {
        return calendar.containsKey(slot);
    }

}
