package finder.socialmediacontactfinder.http.Service.Response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by previousdeveloper on 16.08.2015.
 */
public class ContactInfo implements Serializable {

    private List<Website> websites;
    private String familyName;
    private String fullName;
    private String givenName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }


}
