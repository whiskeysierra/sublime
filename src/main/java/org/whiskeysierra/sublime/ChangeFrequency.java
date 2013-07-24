package org.whiskeysierra.sublime;

import java.util.Locale;

public enum ChangeFrequency {

    ALWAYS, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY, NEVER;

    private final String name = name().toLowerCase(Locale.ENGLISH);

    @Override
    public String toString() {
        return name;
    }

}
