package com.example.cinemabookingproject.service;

import com.example.cinemabookingproject.dto.request.ShowTimeRequest;
import com.example.cinemabookingproject.dto.response.ShowTimeResponse;
import com.example.cinemabookingproject.entity.ShowTime;
import com.example.cinemabookingproject.mapper.ShowTimeMapper;
import com.example.cinemabookingproject.repository.ShowTimeRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShowTimeService {
    ShowTimeRepository showTimeRepository;
    ShowTimeMapper showTimeMapper;

    public List<ShowTimeResponse> create(ShowTimeRequest request){

        var showTimes = showTimeRepository.findByStartTimeIn(request.getStartTime());

        showTimes = showTimeRepository.saveAll(showTimes);
        return showTimeMapper.toResponses(showTimes);
    }
}
