package org.whiskeysierra.sublime;

import org.threeten.bp.LocalDate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class Usage {

    public void test() throws URISyntaxException, IOException {
        final SitemapBuilder builder = Sublime.createBuilder();

        {
            final URL url = builder.createURL();
            url.setLocation(new URI("http://www.example.com"));
            url.setLastModified(LocalDate.now());
            url.setChangeFrequency(ChangeFrequency.MONTHLY);
            url.setPriority(0.3);
        }

        // might be a siteindex + many sitemaps or a single sitemap
        final Sitemap sitemap = builder.build();

        final Path directory = Files.createTempDirectory(null);
        sitemap.writeTo(directory);
    }

}
