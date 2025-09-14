package com.example.cinemabookingproject.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class MovieResponse {
    String id;
    String name, poster;
    Set<ShowTimeResponse> showtimes;
    Integer duration;
    Integer limitAge;
}
