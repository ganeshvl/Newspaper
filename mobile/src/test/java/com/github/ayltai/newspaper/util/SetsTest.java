package com.github.ayltai.newspaper.util;

import com.github.ayltai.newspaper.UnitTest;
import com.github.ayltai.newspaper.app.data.model.NewsItem;

import junit.framework.Assert;

import org.junit.Test;

public final class SetsTest extends UnitTest {
    @Test
    public void testFrom() {
        final NewsItem item = new NewsItem();
        item.setLink("link");

        Assert.assertEquals(item, Sets.from(new NewsItem[] { item }).iterator().next());
    }
}
