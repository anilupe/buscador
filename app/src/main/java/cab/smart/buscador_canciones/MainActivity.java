package cab.smart.buscador_canciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cab.smart.buscador_canciones.commons.commons;
import cab.smart.buscador_canciones.models.Result;
import cab.smart.buscador_canciones.models.SongsModel;
import cab.smart.buscador_canciones.repositories.RestApi;
import cab.smart.buscador_canciones.views.SongsListAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private RecyclerView listViewcanciones;
    private SongsListAdapter mAdapter;
    private SearchView svSearch;
    private Button btn_next;
    private Button btn_back;


    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(commons.baseURL)
            .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit = builder.build();
    RestApi restApi = retrofit.create(RestApi.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewcanciones = (RecyclerView) findViewById(R.id.list_songs);
        svSearch=(SearchView)findViewById(R.id.svSearch);
        svSearch.setOnQueryTextListener(this);
        btn_next=(Button) findViewById(R.id.btn_next);
        btn_back=(Button) findViewById(R.id.btn_back);

        if(commons.offset<1){
            btn_back.setVisibility(View.INVISIBLE);
        }

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             commons.offset= commons.offset+1; //suma uno a la paginacion
             getSongs(commons.term);
             //si es mayor a dos se muestra el boton de regresar a la pagina anterior
                btn_back.setVisibility(View.VISIBLE);

            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //compruba si la paginacion es mayor a dos para mostrar el boton de regreso
                if (commons.offset>1) {
                    commons.offset = commons.offset - 1;
                    getSongs(commons.term);
                }
//
            }
        });

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        commons.term=newText;
        getSongs(commons.term);
        return false;
    }


    public void getSongs(String term){
        Call<SongsModel> call = restApi.getSongs(term,commons.mediaType ,commons.limit,commons.offset );
        call.enqueue(new Callback<SongsModel>() {
            @Override
            public void onResponse(Call<SongsModel> call, Response<SongsModel> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setText(String.valueOf(commons.offset+1));

                        List <Result> songsList= response.body().getResults();
                        System.out.println(songsList.size());
                        listViewcanciones=findViewById(R.id.list_songs);
                        mAdapter=new SongsListAdapter(MainActivity.this,songsList );
                        listViewcanciones.setAdapter(mAdapter);
                        listViewcanciones.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                    }
                    else {
                        Toast.makeText(MainActivity.this, getString(R.string.list_no_items), Toast.LENGTH_LONG).show();
                    }
                }
                if (response.code()==500){
                    Toast.makeText(getApplicationContext(),response.body().toString(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SongsModel> call, Throwable t) {

            }
        });
    }


}