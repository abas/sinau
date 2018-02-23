package io.github.abas.sinaudev.entities;

import com.squareup.moshi.Json;

/**
 * Created by user on 23/02/2018.
 */

public class AccessToken {
    @Json(name = "token_type") String tokenType;
    @Json(name = "expires_in") int expiresIn;
    @Json(name = "access_token") String accessToken;
    @Json(name = "refresh_token") String refreshToken;

}
