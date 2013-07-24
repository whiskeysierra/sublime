package org.whiskeysierra.sublime;

public interface SitemapBuilder {

    URL createURL();

    void add(URL url);

    Sitemap build();

}
