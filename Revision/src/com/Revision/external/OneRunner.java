package com.Revision.external;

import com.Revision.internal.One;

public class OneRunner {
    public static void main(String[] args) {

        One one = new One();
        one.applicationException(5);
        one.arrayStoreException(8);
        one.cannotUndoException(7);
        one.alreadyBoundException(58);
        one.CMMException(16);
    }
}
