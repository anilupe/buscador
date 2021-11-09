package cab.smart.buscador_canciones.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import cab.smart.buscador_canciones.R;

public class album_detail extends AppCompatActivity {
    String bandName;
    String albumName=" ";
    String arte;
    String preview;
    String id;
    String sonName;

    private ImageView iV_arte;
    private TextView txt_album;
    private TextView txt_banda;
    private VideoView vV_preview;
    private TextView txt_sName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        //traer informacion de la actividad anterior
        bandName = getIntent().getExtras().getString("bandName");
        albumName = getIntent().getExtras().getString("albumName");
        arte = getIntent().getExtras().getString("arte");
        preview = getIntent().getExtras().getString("preview");
        id = getIntent().getExtras().getString("idArtist");
        sonName=getIntent().getExtras().getString("songName");

        //declarar widgets
        iV_arte=(ImageView) findViewById(R.id.img_portada);
        txt_album=(TextView) findViewById(R.id.txt_albumName);
        txt_banda=(TextView) findViewById(R.id.txt_bandName);
        vV_preview=(VideoView) findViewById(R.id.Vv_preview);
        txt_sName=(TextView)findViewById(R.id.txt_songName);
        mostrar_Info();
    }

    private void mostrar_Info(){
        txt_album.setText("Nombre del Album: "+ albumName);
        txt_banda.setText("Nombre del Artista o Banda: "+ bandName);
        txt_sName.setText("Nombre de la Canción: "+sonName);
        //mostar imagen
        Picasso.with(this).load(arte
        ).error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(iV_arte);
        //mostrar preview
        Uri uri=Uri.parse(preview);
        vV_preview.setMediaController((new MediaController(this)));
        vV_preview.setVideoURI(uri);
        vV_preview.start();

    }

}