package com.meetingscheduler.inventory;

import com.meetingscheduler.model.Meeting;
import com.meetingscheduler.model.Room;
import com.meetingscheduler.model.Slot;

import java.util.HashMap;
import java.util.Map;

public class RoomInventory {
    private Map<Long, Room> roomMap =new HashMap<>();

    public int getVacantRoomForSlot(Slot slot){
        return roomMap.values().stream()
                .filter(room -> room.checkIfSlotIsEmpty(slot))
                .map(Room::getNumber)
                .findFirst()
                .orElse(-1);
    }


}
