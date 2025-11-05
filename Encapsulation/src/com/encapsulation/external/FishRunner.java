package com.encapsulation.external;

import com.encapsulation.dto.Fish;


    public class FishRunner {
        public static void main(String[] args) {

            Fish fish = new Fish();

            fish.setfishName("Dolphin");
            String fishName = fish.getfishName();
            System.out.println("Fish Name: " + fishName);

            fish.setfishNumber(200);
            int fishNumber = fish.getfishNumber();
            System.out.println("Fish Number: " + fishNumber);

            fish.setNumber((byte) 8);
            byte number = fish.getNumber();
            System.out.println("Fish Byte Number: " + number);

            fish.setSerialNumber(88888888L);
            long serialNumber = fish.getSerialNumber();
            System.out.println("Fish Serial Number: " + serialNumber);

            fish.settotalFish((short) 9);
            short totalFish = fish.gettotalFish();
            System.out.println("Total Fish: " + totalFish);

            fish.setversionNumber(5.5);
            double versionNumber = fish.getVersionNumber();
            System.out.println("Version Number: " + versionNumber);

            fish.setfishversion(2.5f);
            float fishVersion = fish.getfishversion();
            System.out.println("Fish Version: " + fishVersion);

            fish.setVersionUpdated(true);
            boolean isUpdated = fish.getVersionUpdated();
            System.out.println("Is Version Updated: " + isUpdated);

            fish.setUserRating('B');
            char rating = fish.getUserRating();
            System.out.println("User Rating: " + rating);
        }
    }
