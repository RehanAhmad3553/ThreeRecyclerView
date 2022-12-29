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

import com.example.threerecyclerviews.ModelClass.ModelClass_recycler3;
import com.example.threerecyclerviews.R;

import java.util.List;

public class recyclerThree_Adapter extends RecyclerView.Adapter<recyclerThree_Adapter.helloViewHolder>{

    private Context context;
    private List<ModelClass_recycler3> modelClassRecycler3;

    public recyclerThree_Adapter(Context context, List<ModelClass_recycler3> modelClassRecycler3) {
        this.context = context;
        this.modelClassRecycler3 = modelClassRecycler3;
    }

    @Override
    public helloViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view3= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler3_design,parent,false);
        return new helloViewHolder(view3);

    }

    @Override
    public void onBindViewHolder( helloViewHolder holder, int position) {


        holder.image3.setImageResource(modelClassRecycler3.get(position).getImage3());
        holder.text3.setText(modelClassRecycler3.get(position).getText3());

    }

    @Override
    public int getItemCount() {
        return modelClassRecycler3.size();
    }

    class helloViewHolder extends RecyclerView.ViewHolder{
ImageView image3;
TextView text3;
CardView card3;

        public helloViewHolder(@NonNull View itemView) {
            super(itemView);

      image3=itemView.findViewById(R.id.image_recyclerThree);
      text3=itemView.findViewById(R.id.txt_recyclerThree);
      card3=itemView.findViewById(R.id.cardview_recyclerThree);



        }
    }
}
