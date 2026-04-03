package com.example.digitalwallet.service;

import com.example.digitalwallet.model.dto.request.RegisterRequest;
import com.example.digitalwallet.model.dto.response.UserResponse;

public interface UserService {

    UserResponse register(RegisterRequest registerRequest);
}
