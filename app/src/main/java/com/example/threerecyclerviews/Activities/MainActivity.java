package com.example.threerecyclerviews.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;

import com.example.threerecyclerviews.Adapter.recyclerOne_Adapter;
import com.example.threerecyclerviews.Adapter.recyclerTwo_Adapter;
import com.example.threerecyclerviews.ModelClass.ModelClass_recycler2;
import com.example.threerecyclerviews.ModelClass.Modelclass_recycler1;
import com.example.threerecyclerviews.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Modelclass_recycler1> modelrecycle;
    Modelclass_recycler1 modelR1;


    RecyclerView recyclerView2;
    List<ModelClass_recycler2> modelrecycle2;
    ModelClass_recycler2 modelR2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.myrecyclerView);
        recyclerView2 = findViewById(R.id.myrecyclerView2);


        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(staggeredGridLayoutManager);



        /*GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,1);
        recyclerView.setLayoutManager(gridLayoutManager);*/

        modelrecycle = new ArrayList<>();

        modelR1 = new Modelclass_recycler1("FootBall", R.drawable.ic_baseball);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("Tennis", R.drawable.ic_sports_tennis);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("Hockey", R.drawable.ic_sports_hockey);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("BasketBall", R.drawable.ic_basketbal);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("Cricket", R.drawable.ic_sports_cricket);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("Tug Of War", R.drawable.ic_large);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("badminton", R.drawable.ic_kabaddi);
        modelrecycle.add(modelR1);
        modelR1 = new Modelclass_recycler1("FootBall", R.drawable.ic_football);
        modelrecycle.add(modelR1);
        recyclerOne_Adapter recyclerOneAdapter = new recyclerOne_Adapter(MainActivity.this, modelrecycle);
        recyclerView.setAdapter(recyclerOneAdapter);


        //Second Recycler Coding

        StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(staggeredGridLayoutManager2);

    /*GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,1);
        recyclerView2.setLayoutManager(gridLayoutManager);
        */
        modelrecycle2 = new ArrayList<>();

        modelR2 = new ModelClass_recycler2("Bayern Munchen", R.drawable.img1, "#FFBB86FC");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Borusssia Dortmund", R.drawable.img2, "#2C9850");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Eagles", R.drawable.img3, "#FF6200EE");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Titans", R.drawable.img4, "#A58A3A");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Falcons", R.drawable.img5, "#2C9850");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Wizards", R.drawable.im6, "#A58A3A");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("BulletProof", R.drawable.im6, "#FF6200EE");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Hustlers", R.drawable.img7, "#2C9850");
        modelrecycle2.add(modelR2);
        modelR2 = new ModelClass_recycler2("Iconic", R.drawable.img8, "#FFBB86FC");
        modelrecycle2.add(modelR2);


        recyclerTwo_Adapter recyclerTwoAdapter = new recyclerTwo_Adapter(MainActivity.this, modelrecycle2);
        recyclerView2.setAdapter(recyclerTwoAdapter);
    }

}