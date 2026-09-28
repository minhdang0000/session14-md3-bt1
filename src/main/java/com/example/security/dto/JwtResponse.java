package com.example.security.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class JwtResponse {
    @NonNull
    @JsonProperty("access_token")
    private String accessToken;

    @NonNull
    private String username;

    private String type = "Bearer";
}
