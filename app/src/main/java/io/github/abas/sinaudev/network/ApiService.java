package io.github.abas.sinaudev.network;

import io.github.abas.sinaudev.entities.AccessToken;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by user on 23/02/2018.
 */

public interface ApiService {

    @POST("register")
    @FormUrlEncoded
    Call<AccessToken> register(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password
    );
}
