package ihc.unb.com.br.myline.myline.screens.container.restaurant;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.models.Restaurant;
import ihc.unb.com.br.myline.myline.screens.container.ContainerActivity;

public class RestaurantItemActvity extends AppCompatActivity {

    private Restaurant restaurant;

    private CarouselView carouselView;
    private TextView textName;
    private TextView textHour;
    private TextView textLocale;
    private TextView textPhone;
    private Button enterButton;

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
        textHour = (TextView) findViewById(R.id.restaurant_time);
        textLocale = (TextView) findViewById(R.id.restaurant_locale);
        textName = (TextView) findViewById(R.id.restaurant_name);
        enterButton = (Button) findViewById(R.id.enter_line_button);

        textLocale.setText(restaurant.getAddress());
        textName.setText(restaurant.getName());
        enterButton.setOnClickListener(enterClickListener);

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    View.OnClickListener enterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "Você agora está na fila do " + restaurant.getName(), Toast.LENGTH_SHORT).show();
            //((ContainerActivity) getApplicationContext()).bottomBar.selectTabAtPosition(1);
        }
    };

}
