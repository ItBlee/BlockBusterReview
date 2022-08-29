package com.tvproject.blockbusterreview.web.controller;

import com.tvproject.blockbusterreview.web.service.IMovieService;
import com.tvproject.blockbusterreview.web.service.impl.MovieService;
import info.movito.themoviedbapi.model.MovieDb;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {
    private IMovieService movieService;

    @Override
    public void init() throws ServletException {
        movieService = new MovieService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MovieDb> popularList = movieService.getPopularMoviesAtPage(1);
        List<MovieDb> topRatedList = movieService.getTopRatedMoviesAtPage(1);
        List<MovieDb> nowPlayingList = movieService.getNowPlayingMoviesAtPage(1);
        List<MovieDb> upcomingList = movieService.getUpcomingMoviesAtPage(1);
        req.setAttribute("popularList", popularList);
        req.setAttribute("topRatedList", topRatedList);
        req.setAttribute("nowPlayingList", nowPlayingList);
        req.setAttribute("upcomingList", upcomingList);
        RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}