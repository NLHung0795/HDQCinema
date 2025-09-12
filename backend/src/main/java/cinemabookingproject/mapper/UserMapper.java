package com.example.cinemabookingproject.mapper;

import com.example.cinemabookingproject.dto.request.UserCreationRequest;
import com.example.cinemabookingproject.dto.response.UserResponse;
import com.example.cinemabookingproject.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "roles", ignore = true)
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
}
