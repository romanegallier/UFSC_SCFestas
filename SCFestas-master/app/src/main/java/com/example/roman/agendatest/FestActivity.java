package com.example.roman.agendatest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.view.View;
import android.view.View.OnClickListener;


import com.google.android.youtube.player.YouTubeStandalonePlayer;


/**
 * Created by romane on 24/10/2017.
 */

public class FestActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    Festa festa;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fest_descritption);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent i = getIntent();
        festa = (Festa) i.getSerializableExtra("festa");
        TextView nome = (TextView)findViewById(R.id.nome);
        TextView cidade = (TextView)findViewById(R.id.cidade);
        TextView data_inicio = (TextView)findViewById(R.id.data_inicio);
        TextView data_fin = (TextView)findViewById(R.id.data_fin);
        TextView horario = (TextView)findViewById(R.id.horario);
        TextView endereco = (TextView)findViewById(R.id.endereco);
        TextView atracoes = (TextView)findViewById(R.id.atracoes);
        TextView valor_ingresso = (TextView)findViewById(R.id.valor_ingresso);


        if (festa!= null) {
            nome.setText(festa.getNome());
            cidade.setText(festa.getCidade());
            data_inicio.setText(festa.getData_inicio());
            data_fin.setText(festa.getData_fin());
            horario.setText(festa.getHorario());
            endereco.setText(festa.getEndereco());
            atracoes.setText(festa.getAtracoes());
            valor_ingresso.setText(festa.getValor_ingresso());
        }

        button = (Button)this.findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(FestActivity.this, Key.DEVELOPER_KEY, festa.getUrl_video(), 0, true, true);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String s_la= festa.getLatitude();
        String s_lo= festa.getLongitude();
        String nome_festa = festa.getNome();
        double la= Double.valueOf(s_la);
        double lo= Double.valueOf(s_lo);

        LatLng loca_festa = new LatLng(la,lo);

        // Adiciona um marcador no local da festa e move e centraliza o mapa nela.
        mMap.addMarker(new MarkerOptions().position(loca_festa).title(nome_festa));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loca_festa));
    }
}