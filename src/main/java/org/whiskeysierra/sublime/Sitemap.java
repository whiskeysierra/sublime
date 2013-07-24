package org.whiskeysierra.sublime;

import java.io.File;
import java.io.IOException;

public interface Sitemap {

    void writeTo(File directory) throws IOException;

}
