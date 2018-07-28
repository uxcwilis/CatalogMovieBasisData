package com.omrobbie.cataloguemovieuiux.api;

import com.omrobbie.cataloguemovieuiux.model.detail.DetailModel;
import com.omrobbie.cataloguemovieuiux.model.NowPlayingModel;
import com.omrobbie.cataloguemovieuiux.model.SearchModel;
import com.omrobbie.cataloguemovieuiux.model.UpcomingModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface APICall {

    @GET("movie/now_playing")
    Call<NowPlayingModel> getNowPlayingMovie(@Query("language") String language);

    @GET("movie/{movie_id}")
    Call<DetailModel> getDetailMovie(@Path("movie_id") String movie_id, @Query("language") String language);

    @GET("movie/upcoming")
    Call<UpcomingModel> getUpcomingMovie(@Query("language") String language);

    @GET("search/movie")
    Call<SearchModel> getSearchMovie(@Query("query") String query, @Query("language") String language);
}
