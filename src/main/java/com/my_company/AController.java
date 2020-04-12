package com.my_company;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.io.IOException;
import java.io.InputStream;

import static io.micronaut.http.MediaType.IMAGE_JPEG_TYPE;

@Controller
public class AController {
    @Get("/test")
    HttpResponse<byte[]> getContents() throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("who-scared-now.jpg");
        return HttpResponse
                .ok(is.readAllBytes())
                .contentType(IMAGE_JPEG_TYPE);
    }
}
