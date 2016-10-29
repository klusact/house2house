package com.klusact.house2house;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.klusact.house2house.adapter.TerritoryAdapter;
import com.klusact.house2house.model.Territory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Territory> territoryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TerritoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // не знаю пока зачем этот тулбар
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new TerritoryAdapter(territoryList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareTerritoryData();
        }

    // этот метод был в примере - с его помощью мы заполнили данными territoryList
    private void prepareTerritoryData() {
        Territory territory = new Territory("Наукова 68, 1-2 під'їзд", "96");
        territoryList.add(territory);

        territory = new Territory("Наукова 68, 3-4 під'їзд", "97");
        territoryList.add(territory);

        territory = new Territory("Наукова 68, 5-6 під'їзд", "98");
        territoryList.add(territory);

        territory = new Territory("Наукова 68, 7-8 під'їзд", "99");
        territoryList.add(territory);

        territory = new Territory("Наукова 70, 1-2 під'їзд", "100");
        territoryList.add(territory);

        territory = new Territory("Наукова 70, 3-4 під'їзд", "101");
        territoryList.add(territory);

        territory = new Territory("Наукова 70, 5-6 під'їзд", "102");
        territoryList.add(territory);

        territory = new Territory("Наукова 70, 7-8 під'їзд", "103");
        territoryList.add(territory);

        territory = new Territory("Наукова 72, 1-2 під'їзд", "104");
        territoryList.add(territory);

        territory = new Territory("Наукова 72, 3-4 під'їзд", "105");
        territoryList.add(territory);

        territory = new Territory("Наукова 72, 5-6 під'їзд", "106");
        territoryList.add(territory);

        territory = new Territory("Наукова 72, 7-8 під'їзд", "107");
        territoryList.add(territory);

        mAdapter.notifyDataSetChanged();
    }
}
