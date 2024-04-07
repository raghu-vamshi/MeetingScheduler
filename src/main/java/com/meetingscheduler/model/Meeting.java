package com.meetingscheduler.model;

import lombok.Data;

@Data
public class Meeting {

    long id;
    long bookerId;
    Slot slot;
    int assignedRoom;

    public void assignRoom(int room) {
        assignedRoom = room;
    }
}
