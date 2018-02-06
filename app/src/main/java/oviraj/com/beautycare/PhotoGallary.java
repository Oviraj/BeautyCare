package oviraj.com.beautycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class PhotoGallary extends AppCompatActivity {

    Gallery gallery;
    CustomGalleryAdapter GalleryAdapter;
    ImageView selectedImageView,leftArrowImageView,rightArrowImageView;
    public int selectedImagePosition = 0;

    int[] images = {R.drawable.beauty1, R.drawable.beauty2, R.drawable.beauty3, R.drawable.beauty4,
            R.drawable.beauty5, R.drawable.beauty6, R.drawable.beauty7,R.drawable.beauty8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallary);


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupUI();
    }

    private void setupUI() {
        leftArrowImageView = (ImageView) findViewById(R.id.left_arrow_imageview);
        rightArrowImageView = (ImageView) findViewById(R.id.right_arrow_imageview);
        gallery = (Gallery) findViewById(R.id.gallery);
        selectedImageView = (ImageView) findViewById(R.id.selected_imageview); // get the reference of ImageView


        leftArrowImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (selectedImagePosition > 0) {
                    --selectedImagePosition;

                }

                gallery.setSelection(selectedImagePosition, false);
            }
        });

        rightArrowImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (selectedImagePosition < images.length - 1) {
                    ++selectedImagePosition;

                }

                gallery.setSelection(selectedImagePosition, false);

            }
        });

        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectedImageView.setImageResource(images[pos]);
                selectedImagePosition = pos;

                if (selectedImagePosition > 0 && selectedImagePosition < images.length - 1) {

                    rightArrowImageView.setImageDrawable(getResources().getDrawable(R.drawable.arrow_right_enabled));

                } else if (selectedImagePosition == 0) {

                    leftArrowImageView.setImageDrawable(getResources().getDrawable(R.drawable.arrow_left_disabled));

                }

                changeBorderForSelectedImage(selectedImagePosition);
                setSelectedImage();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

        GalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images); // initialize the adapter
        gallery.setAdapter(GalleryAdapter); // set the adapter
        gallery.setSpacing(10);

        if (images.length > 0) {

            gallery.setSelection(selectedImagePosition, false);

        }

    }

    private void changeBorderForSelectedImage(int selectedItemPos) {

        int count = gallery.getChildCount();

        for (int i = 0; i < count; i++) {

            ImageView imageView = (ImageView) gallery.getChildAt(i);
            imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.image_border));
            imageView.setPadding(3, 3, 3, 3);

        }

        ImageView imageView = (ImageView) gallery.getSelectedView();
        imageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.selected_image_border));
        imageView.setPadding(3, 3, 3, 3);
    }
    private void setSelectedImage() {

        // selectedImageView.setScaleType(ImageView.ScaleType.FIT_XY);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
