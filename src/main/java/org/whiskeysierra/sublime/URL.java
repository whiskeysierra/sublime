package org.whiskeysierra.sublime;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;

import javax.annotation.Nullable;
import java.net.URI;

public interface URL {

    void setLocation(URI location);

    void setLastModified(@Nullable LocalDate lastModified);

    void setLastModified(@Nullable LocalDateTime lastModified);

    void setChangeFrequency(@Nullable ChangeFrequency frequency);

    void setPriority(@Nullable Double priority);

}
