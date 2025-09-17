package com.example.cinemabookingproject.repository;

import com.example.cinemabookingproject.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Repository
public interface ShowTimeRepository extends JpaRepository<ShowTime, String> {
    List<ShowTime> findByStartTimeIn(List<LocalDateTime> startTimes);
}
