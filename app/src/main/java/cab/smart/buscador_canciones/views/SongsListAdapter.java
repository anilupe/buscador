package cab.smart.buscador_canciones.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import cab.smart.buscador_canciones.R;
import cab.smart.buscador_canciones.models.Result;

public class SongsListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private final Context context;
    private LayoutInflater inflater;
    private AdapterView.OnItemClickListener mListener;
    List<Result> data = Collections.emptyList();
    ArrayList<Result> listaOriginal;
    Result current;


    public SongsListAdapter(Context context, List<Result> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
        listaOriginal=new ArrayList<>();
        listaOriginal.addAll(data);
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.song_list_item, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder = (MyHolder) holder;
        current = data.get(position);
        //metodo para mostrar imagen desde ws
        Picasso.with(context).load(current.getArtworkUrl100()
        ).error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(myHolder.albumImage);
        myHolder.artistName.setText(current.getArtistName());
        myHolder.trackName.setText(current.getTrackName());
        myHolder.collectionName.setText(current.getCollectionName());
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, album_detail.class);
                intent.putExtra("idArtist", current.getArtistId());
                intent.putExtra("arte", current.getArtworkUrl100());
                intent.putExtra("albumName", current.getCollectionName());
                intent.putExtra("bandName", current.getArtistId());
                intent.putExtra("preview", current.getPreviewUrl());

                context.startActivity(intent);
            }
        });


    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView albumImage;
        public TextView trackName;
        public TextView artistName;
        public TextView collectionName;


        public MyHolder(View itemView) {
            super(itemView);
            //libres_Logistic_Company = itemView.findViewById(R.id.libres_Logistic_Company);
            albumImage=itemView.findViewById(R.id.albumImage);
            trackName = itemView.findViewById(R.id.trackName);
            artistName = itemView.findViewById(R.id.artistName);
            collectionName = itemView.findViewById(R.id.collectionName);

            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
