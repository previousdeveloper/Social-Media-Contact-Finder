package finder.socialmediacontactfinder.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import finder.socialmediacontactfinder.R;
import finder.socialmediacontactfinder.http.Service.Response.Photos;


public class CustomPhotosAdapter extends ArrayAdapter<Photos> {

    private List<Photos> photoses;
    private Context context;
    int layoutResId;

    public CustomPhotosAdapter(Context context, int layoutResId, List<Photos> photoses) {
        super(context, layoutResId, photoses);
        this.context = context;
        this.photoses = photoses;
        this.layoutResId = layoutResId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PhotoHolder photoHolder = null;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.custom_photo_adapter, parent, false);


        photoHolder = new PhotoHolder();

        photoHolder.imageIcon = (ImageView) view.findViewById(R.id.dynamicImageView);
        photoHolder.resource = (TextView) view.findViewById(R.id.socialMediaNameText);

        String url = photoses.get(position).getUrl();
        photoHolder.resource.setText(photoses.get(position).getTypeName());

        if (url != null) {

            Picasso
                    .with(context)
                    .load(url)
                    .into(photoHolder.imageIcon);
        }

        return view;
    }

    static class PhotoHolder {
        ImageView imageIcon;
        TextView resource;
    }
}
