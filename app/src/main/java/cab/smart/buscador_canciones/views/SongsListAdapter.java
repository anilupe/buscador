package cab.smart.buscador_canciones.views;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

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
        Result current = data.get(position);
//        myHolder.libres_Logistic_Company.setText(current.Logistic_Company);
        myHolder.artistName.setText(current.getArtistName());
        myHolder.trackName.setText(current.getTrackName());
        myHolder.collectionName.setText(current.getCollectionName());

    }

    public void filtrado(String txtBuscar){
        int longitud = txtBuscar.length();
        if(longitud==0){
            data.clear();
            data.addAll(listaOriginal);
        }else {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                List<Result>collection=data.stream()
                        .filter(i -> i.getTrackName().toLowerCase().contains(txtBuscar.toLowerCase()))
                        .collect(Collectors.toList());

                data.clear();
                data.addAll(collection);
            }
            else {
                for (Result c:listaOriginal){
                    if (c.getTrackName().toLowerCase().contains(txtBuscar.toLowerCase())){
                        data.add(c);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView trackName;
        public TextView artistName;
        public TextView collectionName;


        public MyHolder(View itemView) {
            super(itemView);
            //libres_Logistic_Company = itemView.findViewById(R.id.libres_Logistic_Company);
            trackName = itemView.findViewById(R.id.trackName);
            artistName = itemView.findViewById(R.id.artistName);
            collectionName = itemView.findViewById(R.id.collectionName);

            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.i("CANCION SELECCIONADA","CORRECTO");
        }
    }
}
