package ihc.unb.com.br.myline.myline.screens.container.notification;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ihc.unb.com.br.myline.R;

/**
 * Created by Bruno on 11/06/2018.
 */

public class NotificationsFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.notification_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new NotificationAdapter(view.getContext()));

        return view;
    }

}
