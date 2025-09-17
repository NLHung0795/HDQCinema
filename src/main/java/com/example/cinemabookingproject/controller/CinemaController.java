package com.example.cinemabookingproject.controller;

import com.example.cinemabookingproject.dto.request.CinemaCreationRequest;
import com.example.cinemabookingproject.dto.response.ApiResponse;
import com.example.cinemabookingproject.dto.response.CinemaResponse;
import com.example.cinemabookingproject.entity.Cinema;
import com.example.cinemabookingproject.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theaters")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @PostMapping
    ApiResponse<CinemaResponse> createCinema(CinemaCreationRequest request){
        var cinema = cinemaService.create(request);

        return ApiResponse.<CinemaResponse>builder()
                .result(cinema)
                .build();
    }
}
