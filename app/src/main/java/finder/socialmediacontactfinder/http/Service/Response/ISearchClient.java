package finder.socialmediacontactfinder.http.Service.Response;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by previousdeveloper on 16.08.2015.
 */
public interface ISearchClient {

    @GET("/person.json")
    void getDetails(@Query("apiKey") String apiKey, @Query("email") String email, Callback<SearchResponse> callback);
}
