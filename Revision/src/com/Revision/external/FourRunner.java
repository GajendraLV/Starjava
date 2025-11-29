package com.Revision.external;

import com.Revision.internal.Four;

public class FourRunner {
    public static void main(String[] args) {
        Four four=new Four();
        four.illFormedLocaleException(5);
        four.imagingOpException(7);
        four.incompleteAnnotationException(6);
        four.indexOutOfBoundsException(3);
        four.jmRuntimeException(5);
    }
}
