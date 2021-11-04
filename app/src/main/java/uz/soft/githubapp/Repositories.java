package uz.soft.githubapp;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import uz.soft.githubapp.adapter.RepoAdapter;
import uz.soft.githubapp.api.ApiService;
import uz.soft.githubapp.databinding.ActivityRepositoriesBinding;
import uz.soft.githubapp.listener.RepoItemClickListener;
import uz.soft.githubapp.model.Repository;
import uz.soft.githubapp.model.User;

public class Repositories extends AppCompatActivity implements RepoItemClickListener {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityRepositoriesBinding binding;
    private User user;
    private RecyclerView recyclerView;
    private ApiService service;
    private RepoAdapter adapter;
    private DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRepositoriesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarRepositories.toolbar);
        setUpDrawNavigation();

        setUp();
        updateHeader();
        headerList();
    }

    private void setUp() {
        User mUser = (User) getIntent().getSerializableExtra("data");
        user = mUser;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(ApiService.class);
    }

    private void setUpDrawNavigation() {
        drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_repositories);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    private void headerList() {
        service.loadAllRepos(user.getLogin()).enqueue(new Callback<List<Repository>>() {
            @Override
            public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                if (response.isSuccessful()) {
                    List<Repository> list = response.body();
                    adapter = new RepoAdapter(list, Repositories.this);
                    recyclerView.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<List<Repository>> call, Throwable t) {
                Toast.makeText(Repositories.this, "Something wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateHeader() {
        NavigationView navigationView = binding.navView;
        View view = navigationView.getHeaderView(0);
        recyclerView = view.findViewById(R.id.rv_repos);
        TextView tvID = view.findViewById(R.id.nav_name);
        TextView tvLogin = view.findViewById(R.id.nav_mail);
        ImageView imageAvatar = view.findViewById(R.id.nav_image);
        tvID.setText("ID" + user.getId().toString());
        tvLogin.setText(user.getLogin());
        Picasso.get().load(user.getAvatar_url()).into(imageAvatar);
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_repositories);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void repoClicked(Repository repository) {
        drawer.closeDrawer(Gravity.LEFT);


    }
}