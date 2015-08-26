package finder.socialmediacontactfinder.http.Service;

import finder.socialmediacontactfinder.http.Service.Response.ISearchClient;
import retrofit.RestAdapter;


public class SearchService {

    public final static String FULL_API_CONTACT_URL = "https://api.fullcontact.com/v2/";
    private ISearchClient _searchClient;


    public ISearchClient getResult() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(FULL_API_CONTACT_URL)
                .build();
        _searchClient = restAdapter.create(ISearchClient.class);


        return _searchClient;
    }
}
