package com.meetingscheduler.model;


import lombok.Value;

@Value
public class Slot {
    long startTime;
    long endTime;

    public Slot(long startTime, long endTime) {
        if(endTime<startTime)
         throw new IllegalArgumentException("invalid end time");
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getDuration(){
        return endTime-startTime;
    }

}
