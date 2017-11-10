package com.hzt.recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RefreshRecyclerView refreshRecyclerView;
    private RefreshRecyclerAdapter adapter;
    private List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshRecyclerView = (RefreshRecyclerView) findViewById(R.id.recycler_view);
        for (int i = 0; i < 20; i++)
            data.add(i + "");
        adapter = new RefreshRecyclerAdapter(data, R.layout.text, true);
        refreshRecyclerView.setAdapter(adapter);
        refreshRecyclerView.setLoadMoreListener(new RefreshRecyclerView.LoadMoreListener() {
            @Override
            public void onLoadMore() {
                Toast.makeText(getApplicationContext(), "LoadMore", Toast.LENGTH_SHORT).show();
            }
        });
        refreshRecyclerView.setOnRefreshListener(new RefreshRecyclerView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshRecyclerView.stopRefresh();
                Toast.makeText(getApplicationContext(), "Refresh", Toast.LENGTH_SHORT).show();
            }
        });
        refreshRecyclerView.setLoadMoreListener(new RefreshRecyclerView.LoadMoreListener() {
            @Override
            public void onLoadMore() {
                for (int i = 0; i < 20; i++)
                    data.add(i + "");
                adapter.setDataList(data);
                adapter.notifyDataSetChanged();
                refreshRecyclerView.stopLoadMore();
            }
        });
        refreshRecyclerView.setPullRefreshEnable(true);
        refreshRecyclerView.setPullLoadEnable(true);
        refreshRecyclerView.forceRefresh();
    }
}
