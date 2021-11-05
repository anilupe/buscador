package cab.smart.buscador_canciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import cab.smart.buscador_canciones.commons.commons;
import cab.smart.buscador_canciones.repositories.RestApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    Retrofit.Builder builder=new Retrofit.Builder()
            .baseUrl(commons.baseURL)
            .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit =builder.build();
    RestApi userSongs =retrofit.create(RestApi.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv;

    }
}