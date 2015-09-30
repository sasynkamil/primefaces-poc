package com.tieto.energy.poc.util;

import java.util.Random;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
public class Generator {

    private static final String[] first = {"John", "Lukas", "Helena", "Georg", "Evelin", "Stephani", "Michael", "Mia", "Olivia"};
    private static final String[] last = {"Washington", "Black", "Newton", "Blair", "Queen", "Davidson", "House", "Moore", "Nelson"};
    private static final int[] timestampTypes = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private static Random random = new Random();

    public static String getName() {
        return first[random.nextInt(first.length)];
    }

    public static String getSurname() {
        return last[random.nextInt(last.length)];
    }

    public static int getTimestampType() {
        return timestampTypes[random.nextInt(timestampTypes.length)];
    }
}
