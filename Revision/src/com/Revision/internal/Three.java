package com.Revision.internal;

import java.awt.geom.IllegalPathStateException;

public class Three {
    public int illegalArgumentException(int num) {
        if (num > 10) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IllegalArgumentException("Illegal argument");
            } catch (IllegalArgumentException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int illegalMonitorStateException(int num) {
        if (num > 14) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IllegalMonitorStateException("Illegal monitor state");
            } catch (IllegalMonitorStateException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int illegalPathStateException(int num) {
        if (num > 18) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IllegalPathStateException();
            } catch (IllegalPathStateException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int illegalStateException(int num) {
        if (num > 20) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IllegalStateException("Illegal state");
            } catch (IllegalStateException e) {
                e.getStackTrace();
                return num;
            }
        }
    }
}

