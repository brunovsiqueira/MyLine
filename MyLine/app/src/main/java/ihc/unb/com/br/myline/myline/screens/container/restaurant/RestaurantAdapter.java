package ihc.unb.com.br.myline.myline.screens.container.restaurant;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.models.Restaurant;

public class RestaurantAdapter extends RecyclerView.Adapter {

    private ArrayList<Restaurant> restaurantList;
    private Context context;
    private RestaurantViewHolder restaurantViewHolder;
    private Restaurant restaurant;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        restaurantViewHolder = (RestaurantViewHolder) holder;
        restaurant = restaurantList.get(position);

        restaurantViewHolder.restaurantName.setText(restaurant.getName());
        restaurantViewHolder.restaurantDescription.setText(restaurant.getDescription());

        if(restaurant.getType() == 2) {
            restaurantViewHolder.restaurantImage.setImageDrawable(context.getResources().getDrawable(R.drawable.drink_icon));
        } else {
            restaurantViewHolder.restaurantImage.setImageDrawable(context.getResources().getDrawable(R.drawable.food_icon));
        }

    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    private class RestaurantViewHolder extends RecyclerView.ViewHolder {

        private ImageView restaurantImage;
        private TextView restaurantName;
        private TextView restaurantDescription;

        public RestaurantViewHolder(View itemView) {
            super(itemView);

            restaurantImage = (ImageView) itemView.findViewById(R.id.restaurant_image);
            restaurantName = (TextView) itemView.findViewById(R.id.restaurant_name);
            restaurantDescription = (TextView) itemView.findViewById(R.id.restaurant_description);

            itemView.setOnClickListener(restaurantClickListener);

        }

        View.OnClickListener restaurantClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RestaurantItemActvity.class);
                intent.putExtra("restaurant", restaurantList.get(getAdapterPosition()));
                context.startActivity(intent);
            }
        };

    }

}
