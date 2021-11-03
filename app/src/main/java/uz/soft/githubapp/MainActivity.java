package uz.soft.githubapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import uz.soft.githubapp.api.ApiService;
import uz.soft.githubapp.common.Constants;
import uz.soft.githubapp.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private ProgressBar pb;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        pb = findViewById(R.id.progressBar);
        pb.setVisibility(View.INVISIBLE);
        etName = findViewById(R.id.tv);
        btn = findViewById(R.id.btn_see);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);

        Intent intent = new Intent(this, Repositories.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb.setVisibility(View.VISIBLE);
                btn.setVisibility(View.INVISIBLE);
                service.loadInfoUser(etName.getText().toString()).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.isSuccessful()) {
                            User body = response.body();
                            if (body != null) {
                                pb.setVisibility(View.INVISIBLE);
                                btn.setVisibility(View.VISIBLE);
                                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                                intent.putExtra("data", body);
                                startActivity(intent);
                            } else {
                                pb.setVisibility(View.INVISIBLE);
                                btn.setVisibility(View.VISIBLE);
                                Toast.makeText(MainActivity.this, "Body of null", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Something goes wrong", Toast.LENGTH_SHORT).show();
                        pb.setVisibility(View.INVISIBLE);
                        btn.setVisibility(View.VISIBLE);
                    }
                });

            }
        });

    }
}