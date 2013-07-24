package org.whiskeysierra.sublime;

import org.jukito.All;
import org.jukito.JukitoRunner;
import org.jukito.TestModule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JukitoRunner.class)
public final class ChangeFrequencyTest {

    private static final class Example {

        final ChangeFrequency input;
        final String expected;

        private Example(ChangeFrequency input, String expected) {
            this.input = input;
            this.expected = expected;
        }

    }

    public static final class Module extends TestModule {

        @Override
        protected void configureTest() {
            bindManyInstances(Example.class,
                new Example(ChangeFrequency.ALWAYS, "always"),
                new Example(ChangeFrequency.HOURLY, "hourly"),
                new Example(ChangeFrequency.DAILY, "daily"),
                new Example(ChangeFrequency.WEEKLY, "weekly"),
                new Example(ChangeFrequency.MONTHLY, "monthly"),
                new Example(ChangeFrequency.YEARLY, "yearly"),
                new Example(ChangeFrequency.NEVER, "never")
            );
        }

    }

    @Test
    public void testToString(@All Example example) {
        Assert.assertEquals(example.expected, example.input.toString());
    }

}
