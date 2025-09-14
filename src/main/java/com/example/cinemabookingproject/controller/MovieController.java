package com.example.cinemabookingproject.controller;

import com.example.cinemabookingproject.dto.request.MovieCreationRequest;
import com.example.cinemabookingproject.dto.response.ApiResponse;
import com.example.cinemabookingproject.dto.response.MovieResponse;
import com.example.cinemabookingproject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping
    ApiResponse<MovieResponse> createMovie(@RequestBody MovieCreationRequest request){
        var movie = movieService.create(request);
        return ApiResponse.<MovieResponse>builder()
                .result(movie)
                .build();
    }
}
