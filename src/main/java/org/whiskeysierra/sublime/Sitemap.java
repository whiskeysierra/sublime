package org.whiskeysierra.sublime;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public interface Sitemap {

    void writeTo(File directory) throws IOException;

    void writeTo(Path directory) throws IOException;

}
