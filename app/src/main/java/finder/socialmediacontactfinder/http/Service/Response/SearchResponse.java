package finder.socialmediacontactfinder.http.Service.Response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by previousdeveloper on 16.08.2015.
 */

public class SearchResponse implements Serializable{

    private static final long serialVersionUID = 1L;

    private List<Photos> photos;
    private ContactInfo contactInfo;
    private List<Organization> organizations;


    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Photos> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photos> photos) {
        this.photos = photos;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }


    @Override
    public String toString() {
        return "SearchResponse{" +
                "photos=" + photos +
                ", contactInfo=" + contactInfo +
                ", organizations=" + organizations +
                '}';
    }
}
