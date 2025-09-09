package com.example.cinemabookingproject.service;

import com.example.cinemabookingproject.dto.request.UserCreationRequest;
import com.example.cinemabookingproject.dto.response.UserResponse;
import com.example.cinemabookingproject.entity.User;
import com.example.cinemabookingproject.mapper.UserMapper;
import com.example.cinemabookingproject.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public UserResponse createUser(UserCreationRequest request){
        User user = userMapper.toUser(request);

        userRepository.save(user);
        return userMapper.toUserResponse(user);
    }
}
