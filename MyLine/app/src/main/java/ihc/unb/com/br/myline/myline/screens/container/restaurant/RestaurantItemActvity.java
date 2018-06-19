package ihc.unb.com.br.myline.myline.screens.container.restaurant;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.models.Restaurant;

public class RestaurantItemActvity extends Activity {

    private Restaurant restaurant;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        restaurant = (Restaurant) getIntent().getSerializableExtra("restaurant");

    }
}
