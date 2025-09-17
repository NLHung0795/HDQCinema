package com.example.cinemabookingproject.mapper;

import com.example.cinemabookingproject.dto.request.RoomRequest;
import com.example.cinemabookingproject.entity.Room;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoomMapper {
    Room toRoom(RoomRequest request);
}
