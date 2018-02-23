package io.github.abas.sinaudev;

import java.io.IOException;
import java.lang.annotation.Annotation;

import io.github.abas.sinaudev.entities.ApiError;
import io.github.abas.sinaudev.network.RetrofitBuilder;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by user on 23/02/2018.
 */

public class Utils {

    public static ApiError converErrors(ResponseBody response){
        Converter<ResponseBody, ApiError> converter = RetrofitBuilder.getRetrofit()
                .responseBodyConverter(ApiError.class,new Annotation[0]);

        ApiError apiError = null;

        try {
            apiError = converter.convert(response);
        }catch (IOException e){
            e.printStackTrace();
        }
        return apiError;
    }


}
