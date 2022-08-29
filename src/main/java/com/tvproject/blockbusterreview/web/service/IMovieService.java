package com.tvproject.blockbusterreview.web.service;

import info.movito.themoviedbapi.model.MovieDb;

import java.util.List;

public interface IMovieService {
    MovieDb getMovieByID(int movieId);

    List<MovieDb> getNowPlayingMoviesAtPage(int page);
    List<MovieDb> getTopRatedMoviesAtPage(int page);
    List<MovieDb> getPopularMoviesAtPage(int page);
    List<MovieDb> getUpcomingMoviesAtPage(int page);
}
