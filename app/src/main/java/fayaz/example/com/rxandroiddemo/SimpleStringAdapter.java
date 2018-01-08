package fayaz.example.com.rxandroiddemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FAIAZ on 1/8/2018.
 */

class SimpleStringAdapter extends RecyclerView.Adapter<SimpleStringAdapter.ViewHolder>{

    private final Context mContext;
    private final List<String> mStrings = new ArrayList<>();


    public SimpleStringAdapter(Context context){
        mContext = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view);
    }

    public void setStrings(List<String> newStrings){
        mStrings.clear();
        mStrings.addAll(newStrings);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.color_display.setText(mStrings.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mStrings.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStrings.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public final TextView color_display;

        public ViewHolder(View itemView) {
            super(itemView);
            color_display = itemView.findViewById(R.id.color_display);
        }
    }
}
