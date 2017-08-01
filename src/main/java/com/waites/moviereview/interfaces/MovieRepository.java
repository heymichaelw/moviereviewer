package com.waites.moviereview.interfaces;

import com.waites.moviereview.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>{

}
