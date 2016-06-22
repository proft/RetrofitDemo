package me.proft.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("posts")
    Call<List<PostItem>> getPosts();

    @GET("posts/{id}")
    Call<PostItem> getPostDetails(@Path("id") int id);
}
