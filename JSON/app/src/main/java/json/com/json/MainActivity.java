package json.com.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ModelGson> modelList;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-54-244-189-132.us-west-2.compute.amazonaws.com:8080/phonebook/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Request request = retrofit.create(Request.class);
        Call<ModelGson> call = request.getJSON();
        Log.i("sssssssssssssssss", call.request().toString());

        call.enqueue(new Callback<ModelGson>() {
            @Override
            public void onResponse(Call<ModelGson> call, Response<ModelGson> response) {

                ModelGson jsonResponse = response.body();
                Log.i("ssssssssss", String.valueOf(jsonResponse.getMessage()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getResponseStatus()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getId()));
                Log.i("ssssssssss", jsonResponse.getUser().getFirstName());
                Log.i("ssssssssss", jsonResponse.getUser().getLastName());
                Log.i("ssssssssss", jsonResponse.getUser().getMobileNumber());
                Log.i("ssssssssss", jsonResponse.getUser().getBirthDate());
                Log.i("ssssssssss", jsonResponse.getUser().getUserType());
                Log.i("ssssssssss", jsonResponse.getUser().getUserStatus());
                Log.i("ssssssssss", jsonResponse.getUser().getGender());
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getAge()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getUserEmails()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getUserInterests()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getUserPhoneNumbers()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getUserProfessions()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getUserWorkplaces()));
                Log.i("ssssssssss", String.valueOf(jsonResponse.getUser().getBusinesses()));
                modelList = new ArrayList<>(Arrays.asList(jsonResponse));
//                adapter = new RecyclerViewAdapter(modelList);
                recyclerView.setAdapter(new RecyclerViewAdapter(modelList, MainActivity.this));
            }

            @Override
            public void onFailure(Call<ModelGson> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }
}
