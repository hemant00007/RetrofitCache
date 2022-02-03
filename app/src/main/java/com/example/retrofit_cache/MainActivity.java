package com.example.retrofit_cache;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        loaddata();
    }

    private void loaddata() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Partner>> call = apiInterface.getData();
        call.enqueue(new Callback<List<Partner>>() {
            @Override
            public void onResponse(Call<List<Partner>> call, Response<List<Partner>> response) {

                if (response.body()!=null){

                    List<Partner> partners = response.body();
                    recyclerView.setAdapter(new MainAdapter(getApplicationContext(),partners));
                }
            }

            @Override
            public void onFailure(Call<List<Partner>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}