package com.Revision.external;

import com.Revision.internal.Three;

public class ThreeRunner {
    public static void main(String[] args) {
        Three three=new Three();
        three.illegalArgumentException(5);
        three.illegalMonitorStateException(7);
        three.illegalPathStateException(10);
        three.illegalStateException(12);
    }
}
