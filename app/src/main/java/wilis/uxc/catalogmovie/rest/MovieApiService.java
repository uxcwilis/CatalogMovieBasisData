package wilis.uxc.catalogmovie.rest;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Call;
import wilis.uxc.catalogmovie.model.MovieResponse;
import wilis.uxc.catalogmovie.model.NowPlayResponse;
import wilis.uxc.catalogmovie.model.SearchMovieResponse;
import wilis.uxc.catalogmovie.model.UpComingResponse;


public interface MovieApiService {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("search/movie")
    Call<SearchMovieResponse> getSearchMovies(@Query("api_key") String apiKey, @Query("query") String query);

    @GET("movie/now_playing")
    Call<NowPlayResponse> getPlayNow(@Query("api_key") String apiKey, @Query("query") int query);

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<UpComingResponse> getUpComing(@Query("api_key") String apiKey);

}







