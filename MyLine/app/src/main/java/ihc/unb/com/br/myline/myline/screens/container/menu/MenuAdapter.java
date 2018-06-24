package ihc.unb.com.br.myline.myline.screens.container.menu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ihc.unb.com.br.myline.R;

public class MenuAdapter extends RecyclerView.Adapter {

    private Context context;

    public MenuAdapter(Context context){
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    private class MenuViewHolder extends RecyclerView.ViewHolder {

        public MenuViewHolder(View itemView) {
            super(itemView);
        }
    }
}
