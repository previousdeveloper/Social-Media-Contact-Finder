package finder.socialmediacontactfinder.http.Service.Response;

import java.io.Serializable;

/**
 * Created by previousdeveloper on 16.08.2015.
 */
public class Photos implements Serializable{
    private String type;
    private String typeId;
    private String typeName;
    private String url;

    public boolean isPrimary() {
        return isPrimary;
    }

    public String getType() {
        return type;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getUrl() {
        return url;
    }

    private boolean isPrimary;
}
