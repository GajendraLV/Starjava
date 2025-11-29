package com.Revision.internal;

import javax.lang.model.type.MirroredTypesException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import java.util.MissingResourceException;

public class Five {
    public int malformedParameterizedTypeException(int num) {
        if (num > 14) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new MalformedParameterizedTypeException();
            } catch (MalformedParameterizedTypeException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int malformedParametersException(int num) {
        if (num > 18) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new MalformedParametersException();
            } catch (MalformedParametersException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int mirroredTypesException(int num) {
        if (num > 20) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new MirroredTypesException(null);
            } catch (MirroredTypesException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int missingResourceException(int num) {
        if (num > 10) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new MissingResourceException("Missing resource", "Two", "key");
            } catch (MissingResourceException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int negativeArraySizeException(int num) {
        if (num > 12) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new NegativeArraySizeException("Negative size not allowed");
            } catch (NegativeArraySizeException e) {
                e.getStackTrace();
                return num;
            }
        }
    }
}
