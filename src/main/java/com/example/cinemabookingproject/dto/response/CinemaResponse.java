package com.example.cinemabookingproject.dto.response;

import com.example.cinemabookingproject.entity.Room;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CinemaResponse {
    String name;
    String city;
    String district;
    String address;
    Set<Room> rooms;
}
