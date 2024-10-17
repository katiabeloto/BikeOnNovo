package br.com.etec.myapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {
//criando variáveis globais para representar a lista e contexto
    private Context context;
    private List<BikeNova>lstBikeNova;

    //criando o construtor
    public RecyclerAdapterBikeNova(Context context, List<BikeNova> lstBikeNova) {
        this.context = context;
        this.lstBikeNova = lstBikeNova;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas,parent,false);
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)   {
holder.idModeloTituloBikeNova.setText(lstBikeNova.get(position).getTitulo());
holder.idModeloImagemBikeNova.setImageResource(lstBikeNova.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return lstBikeNova.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Criando variável que irá representar o xml no java
        CardView idModeloBikeNova;
        ImageView idModeloImagemBikeNova;
        TextView idModeloTituloBikeNova;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Apresentando o java para o xml do modelo
            idModeloBikeNova = itemView.findViewById(R.id.idModeloBikeNova);
            idModeloTituloBikeNova = itemView.findViewById(R.id.idModeloTituloBikeNova);
            idModeloImagemBikeNova = itemView.findViewById(R.id.idModeloImagemBikeNova);
        }
    }

}
