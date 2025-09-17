package com.example.cinemabookingproject.mapper;

import com.example.cinemabookingproject.dto.response.ShowTimeResponse;
import com.example.cinemabookingproject.entity.ShowTime;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ShowTimeMapper {
//    Set<ShowTime> toShowTimes(List<LocalDateTime> time);
//    ShowTimeResponse toShowTimeResponse(ShowTime showTime);
    List<ShowTimeResponse> toResponses(List<ShowTime> showTimes);
}
