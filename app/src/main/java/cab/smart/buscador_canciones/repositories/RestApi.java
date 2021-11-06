package cab.smart.buscador_canciones.repositories;

import java.util.List;
import java.util.Observable;

import cab.smart.buscador_canciones.models.SongsModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {
    @GET("search")
    Call<SongsModel>getSongs(@Query("term") String term,
                             @Query("mediaType") String media,
                             @Query("limit") int limit,
                            @Query("offset") int offset);
}
