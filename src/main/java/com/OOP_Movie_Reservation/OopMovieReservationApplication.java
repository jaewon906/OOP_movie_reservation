package com.OOP_Movie_Reservation;

import com.OOP_Movie_Reservation.Class.MovieImpl;
import com.OOP_Movie_Reservation.Interface.DiscountCondition;
import com.OOP_Movie_Reservation.Interface.Screening;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OopMovieReservationApplication {

    public static void main(String[] args) {
        MovieImpl movie = new MovieImpl();
        movie.movieList();

    }

}
