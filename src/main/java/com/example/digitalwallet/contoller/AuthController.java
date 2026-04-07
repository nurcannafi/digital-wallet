package com.example.digitalwallet.contoller;

import com.example.digitalwallet.model.dto.request.RegisterRequest;
import com.example.digitalwallet.model.dto.response.UserResponse;
import com.example.digitalwallet.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public UserResponse register(@RequestBody @Valid RegisterRequest registerRequest) {

        return userService.register(registerRequest);
    }
}
