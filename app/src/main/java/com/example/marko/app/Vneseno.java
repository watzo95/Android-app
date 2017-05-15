package com.example.marko.app;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.Brand;
import com.example.DataAll;
import com.example.Location;
import com.example.Model;
import com.example.Product;
import com.example.Seller;

import java.util.ArrayList;
import java.util.List;
//import com.example.marko.app.RVAdapter;

public class Vneseno extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ApplicationMy app = new ApplicationMy();
    ApplicationJson appjs = new ApplicationJson();
    private DataAll da = new DataAll();
    //da.load("podatki.json");
    private List<Product> myDataSet = new ArrayList<>();
    ArrayList<Product> listItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vneseno);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        app = (ApplicationMy)getApplication();
        myDataSet = app.vrni();
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        //prepareData();
        // use a linear layout manager


       //mAdapter.notifyDataSetChanged();

        mAdapter = new RVAdapter(myDataSet);
        mLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);


        listItems = app.vrni();
        mAdapter.notifyDataSetChanged();

        // specify an adapter (see also next example)


        //mAdapter = new RVAdapter(listItems);
       // ArrayList<Product> test = new ArrayList<Product>();
        //Model nov = new Model(new Brand("H","Honda"),"SiR","Civic");
        //Location tu = new Location("Leeds, UK",2212212,113121);
        //test.add(new Product(nov,"Selling",1500,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Buying",400,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Worn-Out",100,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"New",800,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Selling",600,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Buying",2000,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Worn-Out",1800,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Selling",1100,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Worn-Out",1800,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Selling",1100,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Worn-Out",1800,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //test.add(new Product(nov,"Selling",1100,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111")));
        //mAdapter = new RVAdapter(app.vrni());
        //app.save();
        //appjs.save(test,"podatki.json");
        //mAdapter = new RVAdapter(myDataSet);
        recyclerView.setAdapter(mAdapter);
        //prepareData();
    }

    private void prepareData() {
        myDataSet = app.vrni();
        mAdapter.notifyDataSetChanged();
    }

}

