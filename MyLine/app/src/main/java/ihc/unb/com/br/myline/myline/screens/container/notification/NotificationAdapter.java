package ihc.unb.com.br.myline.myline.screens.container.notification;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ihc.unb.com.br.myline.R;

public class NotificationAdapter extends RecyclerView.Adapter {

    private Context context;

    public NotificationAdapter(Context context){
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item, parent, false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    private class NotificationViewHolder extends RecyclerView.ViewHolder {

        public NotificationViewHolder(View itemView) {
            super(itemView);
        }
    }
}
