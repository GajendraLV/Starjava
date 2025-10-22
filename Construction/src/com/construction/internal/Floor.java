package com.construction.internal;

public class Floor {
    public void Hall(Room[] room) {
        for (Room rooms : room) {
            rooms.showRoomDetails();

        }
    }
}
