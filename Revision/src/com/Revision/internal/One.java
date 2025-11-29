package com.Revision.internal;

import com.Revision.event.ApplicationException;

import javax.swing.undo.CannotUndoException;
import java.awt.color.CMMException;
import java.nio.channels.AlreadyBoundException;

public class One {

    public int applicationException(int age) {
        if (age > 10) {
            System.out.println("this is age");
            return age;
        } else {
            try {
                throw new ApplicationException();
            } catch (ApplicationException applicationException) {
                applicationException.printStackTrace();
                return age;
            }
        }
    }

    public int arrayStoreException(int num) {
        if (num > 15) {
            System.out.println("this is num");
            return num;
        } else {
            try {
                throw new ArrayStoreException();
            } catch (ArrayStoreException arrayStoreException) {
                arrayStoreException.printStackTrace();
                return num;
            }
        }
    }

    public int cannotUndoException(int flag) {
        if (flag > 5) {
            System.out.println("Undo allowed");
            return flag;
        } else {
            try {
                throw new CannotUndoException();
            } catch (CannotUndoException cannotUndoException) {
                cannotUndoException.printStackTrace();
                return flag;
            }
        }
    }

    public int alreadyBoundException(int age) {
        if (age > 12) {
            System.out.println("bound");
            return age;
        } else {
            try {
                throw new AlreadyBoundException();
            } catch (AlreadyBoundException alreadyBoundException) {
                alreadyBoundException.printStackTrace();
                return age;
            }
        }
    }

    public int CMMException(int age) {
        if (age > 15) {
            System.out.println("cmm");
            return age;
        } else {
            try {
                throw new CMMException("");
            } catch (CMMException cmmException) {
                cmmException.printStackTrace();
                return age;
            }
        }
    }
}
