package com.example.cinemabookingproject.service;

import com.example.cinemabookingproject.dto.request.MovieCreationRequest;
import com.example.cinemabookingproject.dto.response.MovieResponse;
import com.example.cinemabookingproject.dto.response.ShowTimeResponse;
import com.example.cinemabookingproject.entity.Movie;
import com.example.cinemabookingproject.entity.ShowTime;
import com.example.cinemabookingproject.mapper.MovieMapper;
import com.example.cinemabookingproject.repository.MovieRepository;
import com.example.cinemabookingproject.repository.ShowTimeRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class MovieService {

    MovieRepository movieRepository;
    MovieMapper movieMapper;
    ShowTimeRepository showTimeRepository;

    public MovieResponse create(MovieCreationRequest request){
        Movie movie = movieMapper.toMovie(request);

        List<ShowTimeResponse> showTimes = new ArrayList<>();
        for(var showTime : request.getShowTimes()){
            showTimes.add(new ShowTimeResponse(showTime));
        }
        var t = new HashSet<>(showTimes);
        movie.setShowtimes(t);
        movieRepository.save(movie);

        return movieMapper.toMovieResponse(movie);
    }
}
