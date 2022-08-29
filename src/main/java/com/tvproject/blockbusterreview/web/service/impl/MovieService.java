package com.tvproject.blockbusterreview.web.service.impl;

import com.tvproject.blockbusterreview.web.service.IMovieService;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.TmdbMovies.MovieMethod;
import info.movito.themoviedbapi.model.MovieDb;

import java.util.List;

public class MovieService implements IMovieService {
    private static final String apiKey = "18ad4ab491a18b4b8e82f33db316d5c1";
    private static final String LANGUAGE = "en";
    private static final String COUNTRY_NAME = "United States of America";
    private static final String REGION = "US";

    private static TmdbMovies api = null;

    public MovieService() {
        if (api == null)
            api = new TmdbApi(apiKey).getMovies();
    }

    @Override
    public MovieDb getMovieByID(int movieId) {
        return api.getMovie(movieId, LANGUAGE,
                MovieMethod.images, MovieMethod.videos,
                MovieMethod.reviews, MovieMethod.credits,
                MovieMethod.keywords, MovieMethod.similar);
    }

    @Override
    public List<MovieDb> getNowPlayingMoviesAtPage(int page) {
        return api.getNowPlayingMovies(LANGUAGE, page, REGION).getResults();
    }

    @Override
    public List<MovieDb> getTopRatedMoviesAtPage(int page) {
        return api.getTopRatedMovies(LANGUAGE, page).getResults();
    }

    @Override
    public List<MovieDb> getPopularMoviesAtPage(int page) {
        return api.getPopularMovies(LANGUAGE, page).getResults();
    }

    @Override
    public List<MovieDb> getUpcomingMoviesAtPage(int page) {
        return api.getUpcoming(LANGUAGE, page, REGION).getResults();
    }

    public static void main(String[] args) {
        TmdbMovies movies = api = new TmdbApi(apiKey).getMovies();
        List<MovieDb> list = api.getUpcoming(LANGUAGE, 1, REGION).getResults();
        for (MovieDb movieDb:list) {
            System.out.println(movieDb.getReleaseDate());
        }

    }
}
