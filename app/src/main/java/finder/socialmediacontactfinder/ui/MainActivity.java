package finder.socialmediacontactfinder.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import finder.socialmediacontactfinder.R;
import finder.socialmediacontactfinder.http.Service.Response.SearchResponse;
import finder.socialmediacontactfinder.http.Service.SearchService;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    private at.markushi.ui.CircleButton search_button_apply;
    private EditText search_input_text;
    public final static String API_KEY = "9486c9f92cafc7fa";
    private Intent mActivity;
    public final static String SEARCH_RESPONSE = "searchResponse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_button_apply = (at.markushi.ui.CircleButton) findViewById(R.id.search_button_apply);
        search_input_text = (EditText) findViewById(R.id.search_input_editText);

        search_button_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSocial();
            }
        });
    }

    private void getSocial() {
        SearchService searchService = new SearchService();
        searchService.getResult().getDetails(API_KEY, search_input_text.getText().toString(), new Callback<SearchResponse>() {
            @Override
            public void success(SearchResponse searchResponse, Response response) {

                try {

                    if (searchResponse != null) {
                        mActivity = new Intent(getApplicationContext(), SearchListActivity.class);
                        mActivity.putExtra(SEARCH_RESPONSE, searchResponse);
                        startActivity(mActivity);
                    }
                } catch (NullPointerException e) {
                    Log.getStackTraceString(e);
                }

            }

            @Override
            public void failure(RetrofitError error) {

                Toast.makeText(getApplicationContext(), "Malesef seni bulamadim :(", Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
