package uz.soft.githubapp.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import uz.soft.githubapp.model.Repository;
import uz.soft.githubapp.model.User;

public interface ApiService {


    @GET("users/{user}")
    Call<User> loadInfoUser(@Path("user") String user);

    @GET("users/{login}/repos")
    Call<List<Repository>> loadAllRepos(@Path("login") String login);

}
