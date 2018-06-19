package ihc.unb.com.br.myline.myline.screens.container.restaurant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.models.Restaurant;

/**
 * Created by Bruno on 11/06/2018.
 */

public class RestaurantFragment extends Fragment {

    private View view;
    private EditText editSearch;
    private RecyclerView recyclerView;
    private ArrayList<Restaurant> restaurantList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        findViewItems(view);
        createDummyList();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new RestaurantAdapter(getContext(), restaurantList));

        return view;
    }

    private void findViewItems(View view) {

        recyclerView = (RecyclerView) view.findViewById(R.id.restaurant_recyclerview);
        editSearch = (EditText) view.findViewById(R.id.restaurant_search);

    }

    private void createDummyList() {

        restaurantList.add(new Restaurant("Outback Iguatemi", "Restaurante de cozinha australiana, com grande variedade de pratos", 1));
        restaurantList.add(new Restaurant("TAJ Bar", "Bar dançante de culinária tailandesa", 2));
        restaurantList.add(new Restaurant("Outback Pier 21", "Restaurante de cozinha australiana, com grande variedade de pratos", 1));
        restaurantList.add(new Restaurant("Outback Pier 21", "Restaurante de cozinha australiana, com grande variedade de pratos", 1));
        restaurantList.add(new Restaurant("Outback Pier 21", "Restaurante de cozinha australiana, com grande variedade de pratos", 1));

    }

}
