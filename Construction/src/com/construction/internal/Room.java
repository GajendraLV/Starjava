package com.construction.internal;

public class Room {
        int roomNumber;
        String roomType;
        double area;


        public Room(int roomNumber, String roomType, double area) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.area = area;

        }

        public void showRoomDetails() {
            System.out.println("Room Number: " + roomNumber +
                    ", Type: " + roomType +
                    ", Area: " + area + " sq.ft" );
        }
    }
