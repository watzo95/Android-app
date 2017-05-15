package com.example.marko.app;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.Product;
import com.example.Seller;
import com.example.DataAll;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {
    ApplicationMy app;

    private EditText znamka;
    private EditText model;
    private EditText tip;
    private EditText cena;
    private EditText datum;
    private EditText ime;
    private EditText priimek;
    private EditText lokacija;
    private EditText kontakt;
    private TextView naslov;
    private Button oddajPodatke;

    private TextView tvZnamka;
    private TextView tvModel;
    private TextView tvTip;
    private TextView tvCena;
    private TextView tvDatum;
    private TextView tvIme;
    private TextView tvPriimek;
    private TextView tvLokacija;
    private TextView tvKontakt;
    //private static Context context;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app = (ApplicationMy) getApplication();
        Product nov = app.aa.getListOfProducts().get(0);
        Seller one = app.aa.getListOfSellers().get(0);
        DataAll a;


        znamka = (EditText) findViewById(R.id.znamka);
        model = (EditText) findViewById(R.id.model);
        tip = (EditText) findViewById(R.id.tip);
        cena = (EditText) findViewById(R.id.cena);
        datum = (EditText) findViewById(R.id.datum);
        ime = (EditText) findViewById(R.id.ime);
        priimek = (EditText) findViewById(R.id.priimek);
        lokacija = (EditText) findViewById(R.id.lokacija);
        kontakt = (EditText) findViewById(R.id.kontakt);
        naslov = (TextView) findViewById(R.id.naslov);
        oddajPodatke = (Button) findViewById(R.id.button2);

        naslov.setText(nov.getNameOfProduct().toString());
        znamka.setText(nov.getModelName().getModelBrand().toString());
        model.setText(nov.getModelName().getNameModel().toString());
        cena.setText(nov.getPriceOfProduct().toString());
        ime.setText(one.getNameSeller().toString());
        kontakt.setText(one.getContactSeller().toString());
        lokacija.setText(nov.getProductLocation().getNameOfLocation().toString());
        tip.setText(nov.getModelName().getIDModel().toString());

        //app.save(app.aa.getListOfProducts(),"podatki.json");
        /*tvZnamka = (TextView)findViewById(R.id.tvZnamka);
        tvModel = (TextView)findViewById(R.id.tvModel);
        tvTip = (TextView)findViewById(R.id.tvTip);
        tvCena = (TextView)findViewById(R.id.tvCena);
        tvDatum = (TextView)findViewById(R.id.tvDatum);
        tvIme = (TextView)findViewById(R.id.tvIme);
        tvPriimek = (TextView)findViewById(R.id.tvPriimek);
        tvLokacija = (TextView)findViewById(R.id.tvLokacija);
        tvKontakt = (TextView)findViewById(R.id.tvKontakt);*/

        oddajPodatke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*tvZnamka.setText(znamka.getText().toString());
                tvModel.setText(model.getText().toString());
                tvTip.setText(tip.getText().toString());
                tvCena.setText(cena.getText().toString());
                tvDatum.setText(datum.getText().toString());
                tvIme.setText(ime.getText().toString());
                tvPriimek.setText(priimek.getText().toString());
                tvLokacija.setText(lokacija.getText().toString());
                tvKontakt.setText(kontakt.getText().toString());*/
                //Product product = (Product) v.getTag();
                //String getNaslov = naslov.getText().toString();
                //String getZnamka = znamka.getText().toString();
                //String getModel = model.getText().toString();
                Intent intent = new Intent(v.getContext(), MapsActivity.class);
                //app.save();
                //intent.putExtra("Naslov: ", getNaslov);
                //intent.putExtra("Znamka: ", getZnamka);
                //intent.putExtra("Model: ", getModel);
                startActivity(intent);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
