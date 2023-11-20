package com.OOP_Movie_Reservation.Class;

import com.OOP_Movie_Reservation.Interface.Movie;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieImpl implements Movie {
    @Override
    public void movieList() {
        String dataUrl = "C:/Users/planto/IdeaProjects/OOP_Movie_Reservation/src/main/java/com/OOP_Movie_Reservation/Data/movieData.json";
        fileReader(dataUrl);
    }

    @Override
    public void fileReader(String url) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // JSON 파일을 읽어오기
            Object[] movies = objectMapper.readValue(new File(url), Object[].class);

            // Movie 배열을 List로 변환
            List<Object> movieList = new ArrayList<>(Arrays.asList(movies));

            // 읽어온 데이터 확인
            for (Object movie : movieList) {
                System.out.println(movie);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
