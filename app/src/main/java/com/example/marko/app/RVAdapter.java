package com.example.marko.app;

import java.util.ArrayList;
import java.util.List;

import com.example.Product;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.DataAll;
import com.example.Product;
import com.example.Brand;
import java.util.List;

/**
 * Created by marko on 20. 03. 2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    DataAll all;
    Activity ac;
    private List<Product> myDataRV = new ArrayList<>();
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader;
        public TextView txtFooter;

        //private ArrayList<Product> listOfProducts;


        public ViewHolder(View v) {
            super(v);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
    }
}
    public void add(int position, Product item) {
        myDataRV.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(Product item) {
        int position = myDataRV.indexOf(item);
        myDataRV.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RVAdapter(List<Product> myDataset) {
        this.myDataRV = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vrstica, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
            Product nov = myDataRV.get(position);
            holder.txtHeader.setText(nov.getNameOfProduct().toString());
            holder.txtFooter.setText(nov.getPriceOfProduct().toString() + "€, " + nov.getModelName().getModelBrand() + ", " + nov.getModelName().getNameModel());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return myDataRV.size();
    }

}
