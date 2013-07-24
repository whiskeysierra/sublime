package org.whiskeysierra.sublime;

public interface SitemapBuilder {

    void add(URL url);

    Sitemap build();

}
