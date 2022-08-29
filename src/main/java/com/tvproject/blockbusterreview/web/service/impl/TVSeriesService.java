package com.tvproject.blockbusterreview.web.service.impl;

import com.tvproject.blockbusterreview.web.service.ITVSeriesService;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbTV;
import info.movito.themoviedbapi.model.config.Timezone;
import info.movito.themoviedbapi.model.tv.TvSeries;

import java.util.List;

public class TVSeriesService implements ITVSeriesService {
    private static final String apiKey = "18ad4ab491a18b4b8e82f33db316d5c1";
    private static final String LANGUAGE = "";
    private static final String COUNTRY_NAME = "United States of America";
    private static final String REGION = "US";

    private static TmdbTV api = null;

    public TVSeriesService() {
        if (api == null)
            api = new TmdbApi(apiKey).getTvSeries();
    }

    @Override
    public TvSeries getTvSeriesByID(int seriesID) {
        return null;
    }

    @Override
    public List<TvSeries> getAiringTodayTVSeriesAtPage(int page) {
        return api.getAiringToday(LANGUAGE, page, new Timezone(COUNTRY_NAME, REGION)).getResults();
    }

    @Override
    public List<TvSeries> getOnTheAirAtPage(int page) {
        return api.getOnTheAir(LANGUAGE, page).getResults();
    }

    @Override
    public List<TvSeries> getPopularMoviesAtPage(int page) {
        return api.getPopular(LANGUAGE, page).getResults();
    }

    @Override
    public List<TvSeries> getTopRatedMoviesAtPage(int page) {
        return api.getTopRated(LANGUAGE, page).getResults();
    }
}
