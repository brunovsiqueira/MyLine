package ihc.unb.com.br.myline.myline.screens.container.restaurant;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.models.Restaurant;

public class RestaurantItemActvity extends AppCompatActivity {

    private Restaurant restaurant;

    private CarouselView carouselView;
    private TextView textHour;
    private TextView textLocale;
    private TextView textPhone;

    int[] sampleImages = {R.drawable.outback, R.drawable.outback2};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        restaurant = (Restaurant) getIntent().getSerializableExtra("restaurant");

        findViewItems();

        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);


    }

    private void findViewItems() {

        carouselView = (CarouselView) findViewById(R.id.carouselView);


    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

}
