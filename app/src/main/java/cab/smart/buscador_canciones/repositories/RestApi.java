package cab.smart.buscador_canciones.repositories;

import java.util.List;
import java.util.Observable;

import cab.smart.buscador_canciones.models.SongsModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("search?term=in+utero&mediaType=music&limit=20")
    Call<List<SongsModel>>getSongs();
}
