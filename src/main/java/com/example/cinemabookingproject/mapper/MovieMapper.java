package com.example.cinemabookingproject.mapper;

import com.example.cinemabookingproject.dto.request.MovieCreationRequest;
import com.example.cinemabookingproject.dto.response.MovieResponse;
import com.example.cinemabookingproject.entity.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(target = "showtimes", ignore = true)
    Movie toMovie(MovieCreationRequest request);
    MovieResponse toMovieResponse(Movie movie);
}
