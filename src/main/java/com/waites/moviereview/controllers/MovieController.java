package com.waites.moviereview.controllers;

import com.waites.moviereview.interfaces.MovieRepository;
import com.waites.moviereview.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

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

    @RequestMapping("/createMovie")
    public String createMovie(){
        return "createMovie";
    }

    @RequestMapping(value = "/createMovie", method = RequestMethod.POST)
    public String createMoviePost(@RequestParam("movieTitle") String title,
                                  @RequestParam("movieGenre") String genre,
                                  @RequestParam("movieLink") String imdblink,
                                  @RequestParam("movieRelease") String releasedate,
                                  @RequestParam("movieImage") String imageurl){
        Movie movie = new Movie(title, genre, imdblink, releasedate, imageurl);
        movieRepo.save(movie);
        return "redirect:/";
    }




}
