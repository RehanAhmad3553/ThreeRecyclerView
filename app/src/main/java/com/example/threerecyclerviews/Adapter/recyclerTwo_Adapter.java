package com.example.threerecyclerviews.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.threerecyclerviews.ModelClass.ModelClass_recycler2;
import com.example.threerecyclerviews.R;

import java.util.List;

public class recyclerTwo_Adapter extends RecyclerView.Adapter<myViewHolder> {
private Context context;
private List<ModelClass_recycler2> modelClassRecycler2;

    public recyclerTwo_Adapter(Context context, List<ModelClass_recycler2> modelClassRecycler2) {
        this.context = context;
        this.modelClassRecycler2 = modelClassRecycler2;
    }

    @Override
    public myViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View mview= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyceler2_design,parent,false);
        return new myViewHolder(mview);
    }

    @Override
    public void onBindViewHolder( myViewHolder holder, int position) {

holder.img2.setImageResource(modelClassRecycler2.get(position).getImage());
holder.txt2.setText(modelClassRecycler2.get(position).getTextt());
holder.linearLayout.setBackgroundColor(Color.parseColor(modelClassRecycler2.get(position).getColor()));
    }

    @Override
    public int getItemCount() {
        return modelClassRecycler2.size();
    }
}
    class myViewHolder extends RecyclerView.ViewHolder{
        ImageView img2;
        TextView txt2;
        CardView cardView2;
LinearLayout linearLayout;

        public myViewHolder( View itemView) {
            super(itemView);
            img2=itemView.findViewById(R.id.image_recyclerTwo);
            txt2=itemView.findViewById(R.id.txt_recyclerTwo);
            cardView2=itemView.findViewById(R.id.cardview_recyclerTwo);
linearLayout=itemView.findViewById(R.id.recycler_designing2);

        }

}
