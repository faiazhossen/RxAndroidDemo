package fayaz.example.com.rxandroiddemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FAIAZ on 1/8/2018.
 */

class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {
    private Context mContext;
    private List<ExampleActivityAndName> mExamples;

    public DemoAdapter(Context context, List<ExampleActivityAndName> examples) {
        mContext = context;
        mExamples = examples;
    }

    @Override
    public DemoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(mContext)
                .inflate(R.layout.dummy_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DemoAdapter.ViewHolder holder, final int position) {
        holder.mNameDisplay.setText(mExamples.get(position).mName);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dummyIntent = new Intent(mContext,mExamples.get(position).mAClass);
                mContext.startActivity(dummyIntent);;
            }
        });
    }



    @Override
    public int getItemCount() {
        return mExamples.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView mNameDisplay;
        public ViewHolder(View itemView) {
            super(itemView);
            mNameDisplay = itemView.findViewById(R.id.name_display);
        }
    }

}
