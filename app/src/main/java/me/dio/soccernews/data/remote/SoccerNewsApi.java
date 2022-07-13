package me.dio.soccernews.data.remote;

import java.util.List;
import java.util.Map;

import me.dio.soccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}
