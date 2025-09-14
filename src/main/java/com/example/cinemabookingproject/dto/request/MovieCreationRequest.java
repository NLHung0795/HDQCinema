package com.example.cinemabookingproject.dto.request;

import com.example.cinemabookingproject.entity.ShowTime;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MovieCreationRequest {
    String name, poster;
    Integer duration;
    Integer limitAge;
    List<LocalDateTime> showTimes;
}
