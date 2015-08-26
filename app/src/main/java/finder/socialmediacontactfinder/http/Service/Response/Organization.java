package finder.socialmediacontactfinder.http.Service.Response;

import java.io.Serializable;

/**
 * Created by previousdeveloper on 16.08.2015.
 */
public class Organization implements Serializable {
    private boolean isPrimary;
    private String name;
    private String startDate;
    private boolean current;

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }
}
