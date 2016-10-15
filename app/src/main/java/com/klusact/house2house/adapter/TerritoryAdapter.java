package com.klusact.house2house.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.klusact.house2house.R;
import com.klusact.house2house.model.Territory;

import java.util.List;

/**
 * Created by klaus on 15.10.2016.
 */

public class TerritoryAdapter extends RecyclerView.Adapter<TerritoryAdapter.MyViewHolder> {

    private List<Territory> territoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView address, number;

        public MyViewHolder(View view) {
            super(view);
            address = (TextView) view.findViewById(R.id.address);
            number = (TextView) view.findViewById(R.id.number);
        }
    }

    public TerritoryAdapter(List<Territory> territoryList) {
        this.territoryList = territoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_territory, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Territory territory = territoryList.get(position);
        holder.address.setText(territory.getAddress());
        holder.number.setText(territory.getNumber());
    }

    @Override
    public int getItemCount() {
        return territoryList.size();
    }
}
