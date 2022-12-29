package com.example.threerecyclerviews.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.threerecyclerviews.ModelClass.Modelclass_recycler1;
import com.example.threerecyclerviews.R;

import java.util.List;

public class recyclerOne_Adapter extends RecyclerView.Adapter<recyclerOne_Adapter.SportViewHolder> {

private Context mcontext;
private List<Modelclass_recycler1> Modelclass_recycler1;

    public recyclerOne_Adapter(Context mcontext, List<com.example.threerecyclerviews.ModelClass.Modelclass_recycler1> modelclass_recycler1) {
        this.mcontext = mcontext;
        Modelclass_recycler1 = modelclass_recycler1;
    }

    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mview= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_design,parent,false);

        return new SportViewHolder(mview);
    }
    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        holder.imageView.setImageResource(Modelclass_recycler1.get(position).getImage());
holder.textView.setText(Modelclass_recycler1.get(position).getImagetext());



    }

    @Override
    public int getItemCount() {
        return Modelclass_recycler1.size();
    }

    class SportViewHolder extends RecyclerView.ViewHolder{
ImageView imageView;
TextView textView;
CardView cardView;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);

imageView=itemView.findViewById(R.id.image_recyclerOne);
textView=itemView.findViewById(R.id.txt_recyclerOne);
cardView=itemView.findViewById(R.id.cardview_recyclerOne);



        }
    }
}
