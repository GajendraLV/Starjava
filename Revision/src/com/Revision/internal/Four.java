package com.Revision.internal;

import javax.management.JMRuntimeException;
import java.awt.image.ImagingOpException;
import java.lang.annotation.IncompleteAnnotationException;
import java.util.IllformedLocaleException;

public class Four {
    public int illFormedLocaleException(int num) {
        if (num > 10) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IllformedLocaleException("Locale not formed properly");
            } catch (IllformedLocaleException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int imagingOpException(int num) {
        if (num > 15) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new ImagingOpException("Imaging operation failed");
            } catch (ImagingOpException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int incompleteAnnotationException(int num) {
        if (num > 18) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IncompleteAnnotationException(Deprecated.class, "annotation incomplete");
            } catch (IncompleteAnnotationException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int indexOutOfBoundsException(int num) {
        if (num > 12) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new IndexOutOfBoundsException("Index out of range");
            } catch (IndexOutOfBoundsException e) {
                e.getStackTrace();
                return num;
            }
        }
    }

    public int jmRuntimeException(int num) {
        if (num > 16) {
            System.out.println("this is");
            return num;
        } else {
            try {
                throw new JMRuntimeException("JMX runtime error");
            } catch (JMRuntimeException e) {
                e.getStackTrace();
                return num;
            }
        }
    }
}
