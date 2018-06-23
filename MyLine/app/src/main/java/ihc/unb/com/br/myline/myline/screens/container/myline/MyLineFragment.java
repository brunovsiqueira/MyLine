package ihc.unb.com.br.myline.myline.screens.container.myline;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ihc.unb.com.br.myline.R;

/**
 * Created by Bruno on 11/06/2018.
 */

public class MyLineFragment extends Fragment {

    View view;
    SwipeRefreshLayout swipeLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_myline, container, false);

        // Getting SwipeContainerLayout
        swipeLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeContainer);
        // Adding Listener
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // To keep animation for 4 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override public void run() {
                        // Stop animation (This will be after 3 seconds)
                        swipeLayout.setRefreshing(false);
                    }
                }, 2000); // Delay in millis
            }
        });

        // Scheme colors for animation
        swipeLayout.setColorSchemeResources(R.color.colorAccent);

        return view;
    }
}

