package com.example.cinemabookingproject.mapper;

import com.example.cinemabookingproject.dto.request.CinemaCreationRequest;
import com.example.cinemabookingproject.dto.response.CinemaResponse;
import com.example.cinemabookingproject.entity.Cinema;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CinemaMapper {
    @Mapping(ignore = true, target = "rooms")
    Cinema toCinema(CinemaCreationRequest request);
    CinemaResponse toResponse(Cinema cinema);
}
