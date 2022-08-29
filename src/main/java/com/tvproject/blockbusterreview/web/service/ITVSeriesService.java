package com.tvproject.blockbusterreview.web.service;

import info.movito.themoviedbapi.model.tv.TvSeries;

import java.util.List;

public interface ITVSeriesService {
    TvSeries getTvSeriesByID(int seriesID);

    List<TvSeries> getAiringTodayTVSeriesAtPage(int page);
    List<TvSeries> getOnTheAirAtPage(int page);
    List<TvSeries> getPopularMoviesAtPage(int page);
    List<TvSeries> getTopRatedMoviesAtPage(int page);
}
