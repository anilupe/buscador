package cab.smart.buscador_canciones.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cab.smart.buscador_canciones.R;

public class album_detail extends AppCompatActivity {
    String bandName;
    String albumName;
    String arte;
    String preview;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        //traer informacion de la actividad anterior
        bandName = getIntent().getExtras().getString("bandName");
        albumName = getIntent().getExtras().getString("albumName");
        arte = getIntent().getExtras().getString("arte");
        preview = getIntent().getExtras().getString("preview");
        id = getIntent().getExtras().getString("idArtist");

        //declarar widgets



    }
}