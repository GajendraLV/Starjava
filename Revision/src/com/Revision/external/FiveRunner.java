package com.Revision.external;

import com.Revision.internal.Five;

public class FiveRunner {
    public static void main(String[] args) {
        Five five=new Five();
        five.malformedParameterizedTypeException(2);
        five.malformedParametersException(5);
        five.missingResourceException(8);
        five.negativeArraySizeException(9);
        five.mirroredTypesException(6);
    }
}
