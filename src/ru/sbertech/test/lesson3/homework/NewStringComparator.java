package ru.sbertech.test.lesson3.homework;

import java.util.Comparator;

/**
 * Created by Daria on 21.07.2016.
 */
class NewStringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int res = s1.length() - s2.length();
        if (res != 0)
            return res;
        else
            return s1.compareTo(s2);
    }
}