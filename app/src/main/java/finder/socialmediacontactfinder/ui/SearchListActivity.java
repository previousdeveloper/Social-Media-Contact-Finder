package finder.socialmediacontactfinder.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import finder.socialmediacontactfinder.R;
import finder.socialmediacontactfinder.adapter.CustomPhotosAdapter;
import finder.socialmediacontactfinder.http.Service.Response.SearchResponse;

/**
 * Created by previousdeveloper on 16.08.2015.
 */
public class SearchListActivity extends Activity {

    private ListView mPhotoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_list);
        mPhotoList = (ListView) findViewById(R.id.listView16);
        Intent intent = getIntent();
        Gson gson = new Gson();


        SearchResponse searchResponse = (SearchResponse) intent.getSerializableExtra(MainActivity.SEARCH_RESPONSE);
        String data = gson.toJson(searchResponse);


        if (searchResponse.getPhotos() != null) {

            CustomPhotosAdapter customPhotosAdapter = new CustomPhotosAdapter(getApplicationContext(),
                    R.layout.custom_photo_adapter, searchResponse.getPhotos());

            mPhotoList.setAdapter(customPhotosAdapter);

        } else {

            Toast.makeText(getApplicationContext(), "Malesef resmin yok:(", Toast.LENGTH_LONG).show();

        }
    }
}
