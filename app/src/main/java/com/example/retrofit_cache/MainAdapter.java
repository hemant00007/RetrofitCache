package com.example.retrofit_cache;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Myholder> {

    private Context context;
    private List<Partner> partnerlist;

    public MainAdapter(Context context, List<Partner> partnerlist) {
        this.context = context;
        this.partnerlist = partnerlist;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.partnername.setText(partnerlist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return partnerlist.size();
    }

    public class  Myholder extends RecyclerView.ViewHolder{
        private TextView partnername;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            partnername = itemView.findViewById(R.id.name);
        }
    }

}
