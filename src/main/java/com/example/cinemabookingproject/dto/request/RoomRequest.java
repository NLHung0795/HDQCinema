package com.example.cinemabookingproject.dto.request;

import com.example.cinemabookingproject.entity.Cinema;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomRequest {
    String roomName;
    String cinemaId;
}
