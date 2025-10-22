package com.construction.external;

import com.construction.internal.Floor;
import com.construction.internal.Room;

public class FloorRunner {
    public static void main(String[] args) {
        Floor floor = new Floor();
        Room room0 = new Room(10, "bedroom", 22455888d);
        Room room1 = new Room(50, "Hall", 23556554d);
        Room room2 = new Room(50, "Hall", 23556554d);
        Room room3 = new Room(50, "Hall", 23556554d);

        Room[] rooms = {room0, room1, room2, room3};
        floor.Hall(rooms);
    }
}
