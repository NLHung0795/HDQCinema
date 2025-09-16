package com.example.cinemabookingproject.dto.request;

import java.time.LocalDate;
import java.util.List;
public class UserCreationRequest {
    String username, password, email, phoneNumber;
    LocalDate dob;
    List<String> roles;
}
