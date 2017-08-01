package com.waites.moviereview.controllers;

import com.waites.moviereview.interfaces.MovieRepository;
import com.waites.moviereview.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepo;

    @RequestMapping("/")
    public String index(Model model){
        Iterable<Movie> movies = movieRepo.findAll();
        model.addAttribute("movies", movies);
        return "index";
    }
}
