package com.jocelyncooper.backend.repository;

import com.jocelyncooper.backend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findMovieById(Long id);
}
