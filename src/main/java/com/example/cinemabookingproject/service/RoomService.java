package com.example.cinemabookingproject.service;

import com.example.cinemabookingproject.dto.request.RoomRequest;
import com.example.cinemabookingproject.dto.response.RoomResponse;
import com.example.cinemabookingproject.entity.Room;
import com.example.cinemabookingproject.repository.RoomRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoomService {
    RoomRepository roomRepository;

    public RoomResponse create(RoomRequest request){
        
    }
}
