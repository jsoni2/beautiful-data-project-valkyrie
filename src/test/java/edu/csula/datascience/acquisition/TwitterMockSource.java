package edu.csula.datascience.acquisition;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * A mock source to provide data
 */
public class TwitterMockSource implements  Source<TwitterMockData> {
    int index = 0;

    @Override
    public boolean hasNext() {
        return index < 1;
    }

    @Override
    public Collection<TwitterMockData> next() {
        return Lists.newArrayList(
            new TwitterMockData("1", null),
            new TwitterMockData("2", "content2"),
            new TwitterMockData("3", "content3")
        );
    }
}
