package com.example.marko.app;

import android.app.Application;
import com.example.DataAll;
import com.example.Product;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.List;

/**
 * Created by marko on 6. 03. 2017.
 */

public class ApplicationMy extends Application {
    DataAll aa;
    private static final String DATA_MAP = "podatki";
    private static final String FILE_NAME = "podatki.json";

    public ArrayList<Product> vrni() {
        aa = DataAll.scenarijA();
        ArrayList<Product> nov = aa.getListOfProducts();
        return nov;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        aa = DataAll.scenarijA();
    }

    public boolean save() {
        File file = new File(this.getExternalFilesDir(DATA_MAP), ""
                + FILE_NAME);

       return ApplicationJson.save(aa,file);
    }
    public boolean load(){
        File file = new File(this.getExternalFilesDir(DATA_MAP), ""
                + FILE_NAME);
        DataAll tmp = ApplicationJson.load(file);
        if (tmp!=null) aa = tmp;
        else return false;
        return true;
    }
}
